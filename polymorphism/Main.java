package com.technoelevate.polymorphism;

class Movie{
	private String name;

	public Movie(String name) {
		this.name = name;
	}
	
	public String Plot() {
		return "no plots here";
	}
	public String getMovieName() {
		return this.name;
	}
}
class PK extends Movie{
	public PK() {
		super("PK");
	}
	
	@Override
	public String Plot() {
		return "Misunderstandiing God";
	}
}

class Joker extends Movie{

	public Joker() {
		super("Joker");	
	}
	@Override
	public String Plot() {
		return "Smile every time";
	}	
}

class KGF extends Movie{

	public KGF() {
		super("KGF");
	}
	@Override
	public String Plot() {
		return "Surival of the fittest";
	}
}

class Starwar extends Movie{
	
	public Starwar() {
		super("Star Wars");	
}
	@Override
	public String Plot() {
		return "Imperial forces try to take over universe";
	}
}

class Forgattable extends Movie{
	
	public Forgattable() {
		super("Forgattable");	
}
	//No Plots Provide
}



public class Main {

	public static void main(String[] args) {
		
		for(int i=1;i<11;i++) {
			Movie movie = randomMovie();
			System.out.println("Movie #" +i+" : "+movie.getMovieName()+"\n"+"Plot:"+movie.Plot()+"\n");
		}

	}
	public static Movie randomMovie() {
		int randomNumber = (int)(Math.random()*5)+1;
		System.out.println("Random number generated: "+randomNumber);
		
		switch(randomNumber) {
		case 1 :
			return new PK();
		case 2:
			return new Joker();
		case 3:
			return new KGF();
		case 4:
			return new Starwar();
		case 5:
			return new Forgattable();
			default:
				return null;
		}
	}

}
