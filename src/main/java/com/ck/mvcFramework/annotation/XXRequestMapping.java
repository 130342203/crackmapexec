package com.ck.mvcFramework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})//type:类接口；method：方法声明；filed：字段声明；paramater：参数声明
@Retention(RetentionPolicy.RUNTIME)
public @interface XXRequestMapping {
    String value() default "";
}
