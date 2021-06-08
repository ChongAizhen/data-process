package com.chongaizhen.readwrite.configuration;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(value=ElementType.TYPE)
@Target(value=ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DS {
    String value() default "datasource1";
}