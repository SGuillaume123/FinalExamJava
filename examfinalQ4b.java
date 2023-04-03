package examfinal;

public class examfinalQ4b {

	public static void main(String[] args) {
		String consonnes = "bcdfghjklmnpqrstvwxz";
		String voyelles = "aeiouy";
		String mot = "";
		for(int i=0 ; i<voyelles.length() ; i++) {
		mot = mot + consonnes.charAt(i);
		mot = mot + voyelles.charAt(i);
		}
		System.out.println("ICI");
		}
}

// Q4b : • (d) La variable « mot » contient "bacedifoguhy".
