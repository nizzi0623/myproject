package oo.test;

import java.util.ArrayList;

import oo.abstraction.*;

public class Tester {
	public static void main(String[] args){
		Car c = new Car("XX", "AA", 2000);
		ArrayList<String> a = new ArrayList();
		//String[] numbers = {"331", "821", "886", "554"};
		a.add("331");
		a.add("821");
		a.add("886");
		System.out.println(a.size());
		a.add("554");
		System.out.println(a.size());
		a.add(2, "885");
		System.out.println(a);
		String data = a.get(3);
		//int n = (int)a.get(4);
		//�����}�����X��331 821 886 554 ���ϥΪ̿�J�o�����X(���פ���)�A�P�_���ƤT��O�_����
		//���OInvoice

}
}