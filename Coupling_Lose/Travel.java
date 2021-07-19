package com.technoelevate.Coupling_Lose;

public class Travel {

	private Transport transport;
	
	public Travel(Transport transport) {
		this.transport =transport;
	}
	
	public void go() {
		transport.start();
	}
}
