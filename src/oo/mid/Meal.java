package oo.mid;

public class Meal {
	String burger;
	String combo;
	String beverage;
	String sauce;
	int dollar;
	
	public Meal(String burger, String combo, String beverage, int dollar){
		this.burger = burger;
		this.combo = combo;
		this.beverage = beverage;
		this.dollar = dollar;
	}
	
	
	public void setDollar(int a){
		dollar = a;
	}
	
	public int addDollar (int a){
		dollar = dollar + a;
		return dollar;
	}

}
