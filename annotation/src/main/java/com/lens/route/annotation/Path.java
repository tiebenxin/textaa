package com.lens.route.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * date on 2018/3/19
 * author ll147996
 * describe
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface Path {
    String value();
}
