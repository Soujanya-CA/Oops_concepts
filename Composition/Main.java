package com.technoelevate.Composition;

public class Main {

	public static void main(String[] args) {
		
		Case thecase = new Case("220J", "Souju", "240", new Dimension(20,20,5));
		
		Monitor themonitor = new Monitor("beast", "Samsung", 40, new Resolution(2540,1440));
		
		MotherBoard themotherboard = new MotherBoard("intel", "souju", 2, "bios-2.2v");
				
		PC thePC = new PC(thecase, themonitor, themotherboard);
		
		thePC.getCase().pressPowerButton();
		thePC.getMotherboard().loadProgram("Windowa 11");
		thePC.getMonitor().drawPixelAt(1500, 1200, "Black");
	}

}
