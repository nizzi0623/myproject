package oo.shopping;

public class GoldenCustomer extends SilverCustomer{
	private float returnRate = 0.05f;
	
	public GoldenCustomer(int amount){
		super(amount);
		this.discount = (int) (discount * amount);
		this.returnRate = (int) (returnRate * amount);
	}
	
}
