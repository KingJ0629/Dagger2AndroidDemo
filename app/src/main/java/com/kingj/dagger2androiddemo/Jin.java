package com.kingj.dagger2androiddemo;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Jin on 2018/4/23.
 * Description
 */
@Qualifier
@Documented
@Retention(RUNTIME)
public @interface Jin {
}
