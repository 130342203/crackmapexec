package com.ck.mvcFramework.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface XXRequestParam {
    String value() default "";
}
