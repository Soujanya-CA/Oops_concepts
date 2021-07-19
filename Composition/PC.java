package com.technoelevate.Composition;

public class PC {

	private Case theCase;
	private Monitor theMonitor;
	private MotherBoard theMotherboard;
	
	public PC(Case theCase, Monitor theMonitor, MotherBoard theMotherboard) {
		super();
		this.theCase = theCase;
		this.theMonitor = theMonitor;
		this.theMotherboard = theMotherboard;
	}

	public Monitor getMonitor() {
		return theMonitor;
	}

	public MotherBoard getMotherboard() {
		return theMotherboard;
	}

	public Case getCase() {
		return theCase;
	}
	
	
	
	
}
