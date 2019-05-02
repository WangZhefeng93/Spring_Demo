package com.ccff.spring.game.factory;

import com.ccff.spring.game.interceptor.Interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBeanUtil implements InvocationHandler {
    private Object object;  //声明代理对象
    private Interceptor interceptor;    //声明创建的拦截器

    /**
     * 获取动态代理对象。
     * 使用当前类，作为代理方法，此时被代理对象执行方法的时候，会进入当前类的invoke方法里。
     * @param object：被代理的对象
     * @param interceptor：拦截器
     * @return 动态代理对象
     */
    public static Object getBean(Object object,Interceptor interceptor){
        ProxyBeanUtil proxyBeanUtil = new ProxyBeanUtil();
        //保存被代理的对象
        proxyBeanUtil.object = object;
        //保存拦截器
        proxyBeanUtil.interceptor = interceptor;
        //生成代理对象返回，并绑定代理方法
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),proxyBeanUtil);
    }

    /**
     * 代理方法
     * @param proxy：代理对象
     * @param method：当前调用的方法
     * @param args：参数
     * @return 方法返回
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object retObj = null;
        //是否产生异常
        boolean exceptionFlag = false;
        //before方法
        interceptor.before(object);
        try {
            //反射原有方法
            retObj = method.invoke(object,args);
        }catch (Exception ex){
            exceptionFlag = true;
        }finally {
            //after方法
            interceptor.after(object);
        }
        if (exceptionFlag){
            //afterThrowing方法
            interceptor.afterThrowing(object);
        }else {
            //afterReturning方法
            interceptor.afterReturning(object);
        }
        return retObj;
    }
}
