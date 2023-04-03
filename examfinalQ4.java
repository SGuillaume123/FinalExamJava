package examfinal;

import java.util.ArrayList;

public class examfinalQ4 {
	
	public static void main(String[] args) {
		ArrayList<Integer> diviseurs = new ArrayList<Integer>();
		for(int i=3 ; i>=-3 ; i--) {
		diviseurs.add(i);
		}
		System.out.println("ICI");
		for(int diviseur : diviseurs) {
		double quotient = 100/diviseur;
		System.out.println(quotient);
		}
		}

}

	// Q4: (d) Le tableau statique « diviseurs » contient [3, 2, 1, 0, -1, -2, -3].
		

