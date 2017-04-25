package oo.mid;

public class MealTester {

	public static void main(String[] args) {
		
		Meal m1 = new Meal("Pork", "Fries", "Coke", 109);
		Meal m2 = new Meal("Chicken", "Salad", "Sprite", 119);
		Meal m3 = new Meal("Double Beef", "Fries", "Black Tea", 139);
		
		Meal[] meals = new Meal[3];
	    meals[0] = new Meal("Pork", "Fries", "Coke", 109);
	    meals[1] = new Meal("Chicken", "Salad", "Sprite", 119);
	    meals[2] = new Meal("Double Beef", "Fries", "Black Tea", 139);
	    
	    
	    int i = 0;
	    for(i=0; i<3; i++){
		    System.out.println(meals[i].dollar);
	    }
	  

	}

}
