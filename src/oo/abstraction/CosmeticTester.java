package oo.abstraction;

public class CosmeticTester {

	public static void main(String[] args) {
		
		Cosmetic m1 = new Cosmetic("Kat Von D", "Liquid Lipstick", "Berlin");
		Cosmetic m2 = new Cosmetic("M.A.C", "Powder Blush", "Full Of Joy");
		Cosmetic m3 = new Cosmetic("Wet n Wild", "Photo Focus Foundation", "Soft Ivory");
		int[] n = new int[5];
		System.out.println(n[2]);
		
		Cosmetic[] cosmetics = new Cosmetic[3];
		cosmetics[0] = new Cosmetic("Kat Von D", "Liquid Lipstick", "Berlin");
		cosmetics[1] = new Cosmetic("M.A.C", "Powder Blush", "Full Of Joy");
		cosmetics[2] = new Cosmetic("Wet n Wild", "Photo Focus Foundation", "Soft Ivory");
		System.out.println(cosmetics[0].name);
		int i = 0;
		for (i=0; i<3; i++){
			System.out.println(cosmetics[i].name);
		}
		System.out.println(i);
		for (i=1; i<=9; i=i+2){
			System.out.println(i);
		}
		System.out.println(i);

	}

}
