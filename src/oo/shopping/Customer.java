package oo.shopping;

public class Customer {
	
	public int amount;
	public float discount;
	public float returnRate;
	
	static{
		System.out.println("消費金額如下:");
		System.out.println("原本消費\t折扣後\t還元金");
	}

	
	public Customer(){
	
	}
	
	public Customer(int amount){
		this.amount = amount;
		this.discount = amount;
	}
	
	public void print(){
		System.out.println(amount+"\t"+discount+"\t"+returnRate);
	}
	

}
