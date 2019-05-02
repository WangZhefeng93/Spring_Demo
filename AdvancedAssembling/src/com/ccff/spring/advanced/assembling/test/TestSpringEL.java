package com.ccff.spring.advanced.assembling.test;

import com.ccff.spring.advanced.assembling.config.RoleConfig;
import com.ccff.spring.advanced.assembling.pojo.ElBean;
import com.ccff.spring.advanced.assembling.pojo.Role;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpringEL {
    @Test
    public void example(){
        //表达式解析器
        ExpressionParser parser = new SpelExpressionParser();
        //设置表达式
        Expression exp = parser.parseExpression("'hello world'");
        String str = (String) exp.getValue();
        System.out.println("设置表达式："+str);
        //通过EL访问普通方法
        exp = parser.parseExpression("'hello world'.charAt(0)");
        char ch = (Character) exp.getValue();
        System.out.println("通过EL访问普通方法："+ch);
        //通过EL访问的getter方法
        exp = parser.parseExpression("'hello world'.bytes");
        byte[] bytes = (byte[]) exp.getValue();
        System.out.println("通过EL访问的getter方法："+bytes);
        //通过EL访问属性，相当于"hello world".getBytes().length
        exp = parser.parseExpression("'hello world'.bytes.length");
        int length = (Integer) exp.getValue();
        System.out.println("通过EL访问属性："+length);
        exp = parser.parseExpression("new String('abc')");
        String abc = (String) exp.getValue();
        System.out.println(abc);
    }

    @Test
    public void testStandardEvaluationContext(){
        //表达式解析器
        ExpressionParser parser = new SpelExpressionParser();

        //创建角色对象
        Role role = new Role(1L,"role_name","role_note");
        //设置表达式
        Expression exp = parser.parseExpression("roleNote");
        //相当于从role中获取备注信息
        String note = (String) exp.getValue(role);
        System.out.println(note);

        //变量环境类，并且将角色对象role作为其根节点
        EvaluationContext context = new StandardEvaluationContext(role);
        //变量环境类操作根节点
        parser.parseExpression("roleName").setValue(context,"role-name");
        //获取角色名，这里的String.class指明，我们希望返回的是一个字符串
        String name = parser.parseExpression("roleName").getValue(context,String.class);
        System.out.println(name);

        //调用getRoleId方法
        long id = parser.parseExpression("getRoleId()").getValue(context,Long.class);
        System.out.println(id);

        //新增环境变量
        List<String> list = new ArrayList<>();
        list.add("value1");
        list.add("value2");
        //给变量环境增加变量
        context.setVariable("list",list);
        //通过表达式去读/写环境变量的值
        parser.parseExpression("#list[1]").setValue(context,"update_value2");
        System.out.println(parser.parseExpression("#list[1]").getValue(context));
    }

    @Test
    public void TestElBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(RoleConfig.class);
        ElBean elBean = (ElBean) context.getBean("elBean");
        System.out.println(elBean.getInfo());
        System.out.println("圆周率π的值为："+elBean.getPi());
        System.out.println("通过Math类的random方法生成的随机数为："+elBean.getRandom());
        System.out.println("通过Spring EL进行运算："+elBean.getNum());
        System.out.println("通过Spring EL判断id是否为1："+elBean.isEqualId());
        System.out.println("通过Spring EL判断roleName是否为\"new_role_name1\"："+elBean.isEuqalRoleName());
        System.out.println("通过Spring EL判断id是否大于2："+elBean.isIdgreater2());
        System.out.println("使用Spring EL进行三目运算："+elBean.getMin());
    }
}
