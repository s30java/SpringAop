package com.springaop.app;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.aspect.LoggingAspect;
import com.springaop.service.CustomerService;


public class App 
{
    public static void main( String[] args ) 
    {
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "springaop-Aspect.xml" });
    	CustomerService customer = (CustomerService) appContext.getBean("customerservcImpl");
    	
    	//Call this method to call @after and @before for loggin aspect
    	//customer.addCustomer();
    	
    	//Call this method to get the return result for loggin aspect
    	//customer.addCustomerReturn("satish");
    	
    	//Call this method to get exception call 
    	try {
		//	customer.addCustomerThrowException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	//CAll thi smethod to call@ around loggin
    	customer.addCustomerAround("Satish called for around");
    	
    }
    
    
    
    
}
