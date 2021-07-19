package com.technoelevate.Composition;

public class Case {

	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimension dimention;
	
	public Case(String model, String manufacturer, String powerSupply, Dimension dimention) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimention = dimention;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimension getDimention() {
		return dimention;
	}
	
	
	
	
}
