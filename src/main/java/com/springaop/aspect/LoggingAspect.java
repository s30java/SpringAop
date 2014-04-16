package com.springaop.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.ApplicationContext;

@Aspect
public class LoggingAspect {
	
	 @After("execution (* com.springaop.service.CustomerService.addCustomer(..))")
	public  void logAfter(JoinPoint jpt){
		 System.out.println("************logAfter() is running!************");
			System.out.println("hijacked : " + jpt.getSignature().getName());
			System.out.println("************************************************");
    	
    }
    @Before("execution (* com.springaop.service.CustomerService.addCustomer(..))")
    public  void logBefore(JoinPoint jpt){
    	System.out.println("************logBefore() is running!************");
		System.out.println("hijacked : " + jpt.getSignature().getName());
		System.out.println("*****************Now logBefore() may run ************");
    }
    
    @AfterReturning( pointcut="execution (* com.springaop.service.CustomerService.addCustomerReturn(..))",returning="result")
    public  void logAfterReturn(JoinPoint jpt,Object result){
    	System.out.println("************logAfterReturn() is running!************");
		System.out.println("hijacked : " + jpt.getSignature().getName());
		System.out.println("***********Returned value is :::: "+result);
		System.out.println("*****************************");
    }
    @AfterThrowing( pointcut="execution (* com.springaop.service.CustomerService.addCustomerReturn(..))",throwing="error")
    public  void logAfterThrowException(JoinPoint jpt,Throwable error){
    	System.out.println("************logAfterThrowException() is running!************");
		System.out.println("hijacked : " + jpt.getSignature().getName());
		System.out.println("***********Errro been thrown by :::: "+error);
		System.out.println("*****************************");
    }
    
    @Around("execution (* com.springaop.service.CustomerService.addCustomerAround(..))")
    public void logAround(ProceedingJoinPoint proceedjpt) throws Throwable{
    	System.out.println("************logAround() is running!************");
		System.out.println("hijacked : " + proceedjpt.getSignature().getName());
		System.out.println("************aray name from PJT!"+Arrays.toString(proceedjpt.getArgs()));
		System.out.println("Around before is running!");
		proceedjpt.proceed(); //continue on the intercepted method
		System.out.println("Around after is running!");
		System.out.println("*****************************");
    	
    }
    
}
