package com.qa.Domain;

public class Mechanic {
	
	private int fuelAmount;
	private boolean MOT;
	private double repairCost;
	
	public int getFuelAmount() {
		return fuelAmount;
	}
	public void setFuelAmount(int fuelAmount) {
		this.fuelAmount = fuelAmount;
	}
	public boolean isMOT() {
		return MOT;
	}
	public void setMOT(boolean mOT) {
		MOT = mOT;
	}
	public double getRepairCost() {
		return repairCost;
	}
	public void setRepairCost(double repairCost) {
		this.repairCost = repairCost;
	}
	
	

}
