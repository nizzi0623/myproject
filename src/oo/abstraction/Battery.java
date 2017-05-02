package oo.abstraction;

public class Battery extends Car{
	public Battery(String brand, String name, int cc){
		super(brand, name, cc);
		this.brand = brand;
		this.name = name;
		this.cc = cc;
	}

}
