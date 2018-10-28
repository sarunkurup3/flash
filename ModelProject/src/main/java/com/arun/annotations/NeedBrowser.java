package com.arun.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface NeedBrowser {

	String name() default "";
	String remoteUrl() default "";
	String capabilityFilePath() default "";
	
}
