package oo.shopping;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		System.out.println("原價"+"\t"+"折扣後"+"\t"+"回饋金");
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer(6000));
		list.add(new SilverCustomer(8000));
		list.add(new GoldenCustomer(10000));
		list.add(new GoldenCustomer(15000));
		list.add(new SilverCustomer(1000));
		list.add(new Customer(6000));
		for (int i=0; i<list.size(); i++){
			Customer cust = list.get(i);
			if (cust instanceof SilverCustomer &&
					!(cust instanceof GoldenCustomer)){
				System.out.print("*");
			}
			cust.print();
		}
		String[] array = {"aa", "bb", "cc"};
		

	}

}
