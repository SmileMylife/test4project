package com.asiainfo.aspect;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by ZhangPei on 2018/5/17.
 */
@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(* com.asiainfo.crm.YNcrmIntter.queryCustInfo(..))")
    public void crmSwitch() {

    }

    @Around("crmSwitch()")
    public void beforeQueryCustInfo() {
        System.out.println("执行查询三户信息接口");
    }
}
