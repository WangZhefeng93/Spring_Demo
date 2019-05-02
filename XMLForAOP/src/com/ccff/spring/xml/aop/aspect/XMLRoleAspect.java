package com.ccff.spring.xml.aop.aspect;

import com.ccff.spring.xml.aop.pojo.Role;
import com.ccff.spring.xml.aop.verifier.RoleVerifier;
import org.aspectj.lang.ProceedingJoinPoint;

public class XMLRoleAspect {
    public RoleVerifier roleVerifier = null;

    public void before(Role role){
        System.out.println("Before方法执行，打印Role对象："+role);
    }

    public void after(){
        System.out.println("After方法执行......");
    }

    public void afterReturning(){
        System.out.println("AfterReturning方法执行......");
    }

    public void afterThrowing(){
        System.out.println("AfterThrowing方法执行......");
    }

    public void around(ProceedingJoinPoint joinPoint){
        System.out.println("Around方法执行前......");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            new RuntimeException("回调原有流程，产生异常");
            //throwable.printStackTrace();
        }
        System.out.println("Around方法执行后......");
    }

}