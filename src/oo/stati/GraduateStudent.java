package oo.stati;

public class GraduateStudent extends Student {
	int thesis;
	public GraduateStudent(int english, int math, int chinese){
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	
	@Override//檢查是否有無copy錯誤
	public void print(){
		System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese)+"\t"+thesis);
		//主類別改成protected這裡的子類別才可以複製使用
	}
}
