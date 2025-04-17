package com.itp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.itp.model.Car;
import com.itp.model.Engine;
import com.itp.model.Tyre;

@Configuration
@ComponentScan(basePackages = "com.itp")
public class AppContext {
	
	@Bean(name="e70")
	@Scope("prototype")
	public Engine getEngineUsingConstructor()
	{
		Engine engine=new Engine(2.5,2500,"Tesla","Electric");
		return engine;
	}
	
	@Bean(name="e71")
	@Scope("prototype")
	public Engine getEngineUsingSetter()
	{
		Engine engine=new Engine();
		engine.setEngineCC(1000);
		engine.setEngineLitre(1);
		engine.setEngineMfgName("Ferrari");
		engine.setEngineType("Petrol");
		return engine;
	}
	
	
	@Bean(name="t80")
	@Scope("prototype")
	public Tyre getTyreUsingSetter()
	{
		Tyre tyre=new Tyre();
		tyre.setTyreMfgName("Michilin");
		tyre.setTyrePrice(9999);
		tyre.setTyreType("Racing Car");
		return tyre;
	}
	
	@Bean(name="c81")
	@Scope("prototype")
	public Car getCarUsingSetter()
	{
		Car car=new Car();
		car.setCarMfgName("Honda");
		car.setCarModelName("Civic");
		car.setCarPrice(1000);
		car.setCarType("Sedan");
		return car;
	}
	
	

}

//