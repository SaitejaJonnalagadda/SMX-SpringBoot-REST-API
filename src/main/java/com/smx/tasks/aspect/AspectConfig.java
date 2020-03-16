package com.smx.tasks.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectConfig {
	
	 // Here I used @Around annotation. 
	//And whenever the corresponding method is exexuting, then 
	//aspectjs will capture that which means call will 
	//come to below method where we can log whatever we need from the request and response. 
	
	@Around("execution(* DBServiceA.getData(..))") //point-cut expression
    public void logForDBService(JoinPoint joinPoint)
    {
        System.out.println("getData  " + joinPoint.getSignature().getName());
    }
	
	@Around("execution(* HttpServiceB.sendMessage(..))") //point-cut expression
    public void logForHttpService(JoinPoint joinPoint)
    {
        System.out.println("sendMessage  " + joinPoint.getSignature().getName());
    }

}
