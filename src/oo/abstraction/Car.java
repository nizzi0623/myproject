package oo.abstraction;

public class Car {
	String brand;
	int cc;
	String name;
	String type;
	int status;
	int id;
	float milage;
	//Fields
	
	public Car(String brand, String name){
		this(brand, name, 0);
		System.out.println("haha");
	}
	
	public Car(String brand, String name, int cc){
		this.brand = brand;
		this.name = name;
		this.cc = cc;
	}
	//以上均為區域變數local variable
	//register最快
	//方法:public void xxx(){}
	//void:回傳值return type
	//method name:xxx
	
	public void setMilage(int m){
		milage = m;
	}
	
	public void maintain(){
		status = 5;
		//第一個單字全部小寫第二個單字開頭大寫
	}
	
	public float addMilage(int m){
		milage = milage + m;
		return milage;
	}

}
