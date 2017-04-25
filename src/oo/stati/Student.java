package oo.stati;

public class Student {
	//屬性(Fields, Instance Viarable 實例變數)
	int english;
	int math;
	int chinese;
	static int pass = 60;
	//static類別變數，應用上用得到才用
	static{
		System.out.println("STATIC!!!");
		//System.out.println(english);
		//因為在static區塊是物件還沒生成就執行 所以english不能再static區快執行
		System.out.println(pass);
		//還沒發生就有資料了所以在static可以使用他
	}
	
	//static會最先執行
	//Static區塊裡不能使用到類別屬性的用法 例如this
	public Student(int english, int math, int chinese){
		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	public void print(){
		System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese));
		
	}
	private String getScore(int score){
		if (score < pass){
			return String.valueOf(score)+"*";
		}else{
			return String.valueOf(score);
		}
	}

}
