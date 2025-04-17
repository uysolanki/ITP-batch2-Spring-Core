package com.itp.model;

import org.springframework.stereotype.Component;

@Component
public class Gear {

		private int gearLever;
		private String gearType;
		private String mfgName;
		
		public Gear() {
			this.gearLever = 7;
			this.gearType = "Hybrid";
			this.mfgName ="Tata";
		}
		public Gear(int gearLever, String gearType, String mfgName) {
			this.gearLever = gearLever;
			this.gearType = gearType;
			this.mfgName = mfgName;
		}
		public int getGearLever() {
			return gearLever;
		}
		public void setGearLever(int gearLever) {
			this.gearLever = gearLever;
		}
		public String getGearType() {
			return gearType;
		}
		public void setGearType(String gearType) {
			this.gearType = gearType;
		}
		public String getMfgName() {
			return mfgName;
		}
		public void setMfgName(String mfgName) {
			this.mfgName = mfgName;
		}
		
		@Override
		public String toString() {
			return "Gear [gearLever=" + gearLever + ", gearType=" + gearType + ", mfgName=" + mfgName + "]";
		}
		
		
		
}
