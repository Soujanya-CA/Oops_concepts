package com.technoelevate.encapsulation;

public class Player {
	
	public String name;
	public int health;
	public String weapon;
	
	public void looseHealth(int damage) {
		this.health-=damage;
		System.out.println("Remaining health:" +this.health);
		if(this.health<=0) {
			System.out.println("Player Knocked out");
		}
	}
}
