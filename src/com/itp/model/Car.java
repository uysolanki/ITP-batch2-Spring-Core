package com.itp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

		private String carType;
		private String carMfgName;
		private String carModelName;
		private double carPrice;
		
		@Autowired  //autowire by-name
		@Qualifier("e71")
		private Engine engine;
		
		@Autowired  //autowire by-type
		private Tyre tyre;
		
		@Autowired
		private Gear gear;
		
		
		
		public Car() {}
		public Car(String carType, String carMfgName, String carModelName, double carPrice, Engine engine, Tyre tyre) {
			this.carType = carType;
			this.carMfgName = carMfgName;
			this.carModelName = carModelName;
			this.carPrice = carPrice;
			this.engine = engine;
			this.tyre = tyre;
		}
		
		
		
		public String getCarType() {
			return carType;
		}
		public void setCarType(String carType) {
			this.carType = carType;
		}
		public String getCarMfgName() {
			return carMfgName;
		}
		public void setCarMfgName(String carMfgName) {
			this.carMfgName = carMfgName;
		}
		public String getCarModelName() {
			return carModelName;
		}
		public void setCarModelName(String carModelName) {
			this.carModelName = carModelName;
		}
		public double getCarPrice() {
			return carPrice;
		}
		public void setCarPrice(double carPrice) {
			this.carPrice = carPrice;
		}
		public Engine getEngine() {
			return engine;
		}
		public void setEngine(Engine engine) {
			this.engine = engine;
		}
		public Tyre getTyre() {
			return tyre;
		}
		public void setTyre(Tyre tyre) {
			this.tyre = tyre;
		}
		@Override
		public String toString() {
			return "Car [carType=" + carType + ", carMfgName=" + carMfgName + ", carModelName=" + carModelName
					+ ", carPrice=" + carPrice + ", engine=" + engine + ", tyre=" + tyre + ", gear=" + gear + "]";
		}
		
		
		
		
		
}
