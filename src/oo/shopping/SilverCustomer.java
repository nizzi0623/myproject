package oo.shopping;

public class SilverCustomer extends Customer{
	
	public static float discount = 0.9f;
	
	public SilverCustomer(int amount){
		super(amount);
		this.discount = (int) (amount * discount);
	}
	

}
