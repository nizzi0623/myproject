package oo.stati;

public class GraduateStudent extends Student {
	int thesis;
	public GraduateStudent(int english, int math, int chinese){
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	
	@Override//�ˬd�O�_���Lcopy���~
	public void print(){
		System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese)+"\t"+thesis);
		//�D���O�令protected�o�̪��l���O�~�i�H�ƻs�ϥ�
	}
}
