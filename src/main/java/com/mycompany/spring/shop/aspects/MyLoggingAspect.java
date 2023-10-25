/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring.shop.aspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {
    
//    Logger logger = LogManager.getLogger(MyLoggingAspect.class);
//    @Before("execution(* com.mycompany.spring.shop.dao.*.*(..))")
//  public void aroundAllMethodsAdvice(JoinPoint joinPoint){
//      logger.info("this is a info msg");
//      logger.error("this is a error msg");
//      logger.debug("Intrare metoda" + joinPoint.getSignature().toShortString());
//      System.out.println("Advice is working");
//  }  
}
