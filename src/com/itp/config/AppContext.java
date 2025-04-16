package com.itp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.itp.model.Engine;

@Configuration
public class AppContext {
	
	@Bean(name="e77")
	@Scope("prototype")
	public Engine getEngineUsingConstructor()
	{
		Engine engine=new Engine(2.5,2500,"Tesla","Electric");
		return engine;
	}

}
