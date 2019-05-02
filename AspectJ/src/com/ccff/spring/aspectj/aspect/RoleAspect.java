package com.ccff.spring.aspectj.aspect;

import com.ccff.spring.aspectj.check.RoleVerifier;
import com.ccff.spring.aspectj.check.RoleVerifierImpl;
import com.ccff.spring.aspectj.pojo.Role;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class RoleAspect {
    @DeclareParents(value = "com.ccff.spring.aspectj.service.RoleServiceImpl+",defaultImpl = RoleVerifierImpl.class)
    public RoleVerifier roleVerifier;

    @Pointcut("execution(* com.ccff.spring.aspectj.service.RoleServiceImpl.printRole(..))")
    public void print(){

    }

    @Before("print()" + "&& args(role,sort)")
    public void before(Role role,int sort){
        System.out.println("Before方法执行：首先打印Role对象\n"+role.toString()+"\n然后打印整型排序数sort："+sort+"\n");
    }

    @After("print()")
    public void after(){
        System.out.println("After方法执行......");
    }

    @AfterReturning("print()")
    public void afterReturning(){
        System.out.println("AfterReturning方法执行......");
    }

    @AfterThrowing("print()")
    public void afterThrowing(){
        System.out.println("AfterThrowing方法执行......");
    }

    @Around("print()")
    public void around(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("Around方法执行前......");
        try {
            System.out.println("Around方法执行......");
            proceedingJoinPoint.proceed();
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        System.out.println("Around方法执行后......");
    }
}