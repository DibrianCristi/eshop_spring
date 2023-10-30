/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring.shop.aspects;

import com.mycompany.spring.shop.dao.LogDAO;
import com.mycompany.spring.shop.entity.Log;
import com.mycompany.spring.shop.service.LogService;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {

    Logger logger = LogManager.getLogger(MyLoggingAspect.class);
    Log log = new Log();
    LogService logService;

    @Autowired
    public MyLoggingAspect(LogService logService) {
        this.logService = logService;
    }

//    @AfterThrowing(pointcut = "execution(* com.mycompany.spring.shop.dao.*.*(..))", throwing = "exc")
//    public void ExceptionHandling(JoinPoint joinPoint, Throwable exc) {
//        try {
//            Date time = new Date();
//            Log log = new Log();
//            log.setMsg(exc.getMessage());
//            //log.setDate(time);
//            log.setSeverity("Metoda " + joinPoint.getSignature().toShortString());
//            System.out.println(time.toString());
//            System.out.println(exc.getMessage());
//            System.out.println("Metoda " + joinPoint.getSignature().toShortString());
//            logService.saveLog(log);
//        } catch (Exception e) {
//            logger.error("Error in ExceptionHandling" + e.getMessage());
//        }
//
//    }
}
