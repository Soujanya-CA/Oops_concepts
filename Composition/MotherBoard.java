package com.technoelevate.Composition;

public class MotherBoard {

	private String model;
	private String manufacturer;
	private int ramSlots;
	private String bios;
	
	public MotherBoard(String model, String manufacturer, int ramSlots, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.bios = bios;
	}

	public void loadProgram(String programName) {
		System.out.println("Program "+programName+ " is now loading...");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public String getBios() {
		return bios;
	}

}
