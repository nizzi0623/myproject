package oo.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");
		a.add(2, "885");
		
		System.out.println("請輸入發票號碼:");
		Scanner scanner = new Scanner(System.in);
		String x = scanner.nextLine();
		int number = Integer.parseInt(x);
		x = scanner.nextLine();
		String prize = x.substring(5, 7);
		
	
		
		
		
		



	}

}
