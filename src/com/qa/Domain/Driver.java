package com.qa.Domain;

public class Driver{
    private int mileage;

    // functionality
    public void drive(String milesDriven){
        this.setMileage(this.getMileage() + milesDriven);
    }

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
 
    
}