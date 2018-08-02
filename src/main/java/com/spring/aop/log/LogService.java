package com.spring.aop.log;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author: yhy
 * @Date: 2018/8/2 18:11
 * @Version 1.0
 * 基于注解的 Aspect
 * 1.添加 @Aspect
 * 2.添加 支持aspect 的配置 <aop:aspectj-autoproxy/>
 */
@Aspect
@Component
public class LogService {
   final static Logger logger = Logger.getLogger(LogService.class);


    @Before(value = "execution(* com.spring.aop.service.impl..*(..))")
    public String testLoger(JoinPoint joinPoint) {

        String name = joinPoint.getSignature().getName();
        logger.info("------------哈哈logger----logger-------");
        System.out.println("------------哈哈logger----system-------");
        System.out.println("--------"+name+"------");
        return "logger";
    }

}
