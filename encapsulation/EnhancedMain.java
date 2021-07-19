package com.technoelevate.encapsulation;

public class EnhancedMain {

	public static void main(String[] args) {
		EnhancePlayer player = new EnhancePlayer("Souju",100,"Assult rifle M4");
		player.looseHealth(30);
		player.looseHealth(70);
		//System.err.println(player.getHelath());
	}

}
