package oo.shopping;

public class Customer {
	
	public int amount;
	public float discount;
	public float returnRate;
	
	static{
		System.out.println("���O���B�p�U:");
		System.out.println("�쥻���O\t�馩��\t�٤���");
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
