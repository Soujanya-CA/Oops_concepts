package com.technoelevate.encapsulation;

public class EnhancePlayer {
	
	private String fullName;
	private int health;
	private String weapon;
	
	
	public EnhancePlayer(String fullName, int health, String weapon) {
		super();
		this.fullName = fullName;
		this.health = health;
		this.weapon = weapon;
	}
	
	public void looseHealth(int damage) {
		this.health-=damage;
		System.out.println(this.fullName+ " 's Remaining health:" +this.health);
		if(this.health<=0) {
			System.out.println("Player Knocked out");
		}
	}
	
	public void gainHealth(int support) {
		
	}


	public String getName() {
		return fullName;
	}


	public int getHelath() {
		return health;
	}


	public String getWeapon() {
		return weapon;
	}

}
