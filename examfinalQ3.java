package examfinal;

import java.util.ArrayList;

public class examfinalQ3 {

	public static void main(String[] args) {
		//creation du tableau de valeurs flottantes
		ArrayList<Float> tableau = new ArrayList<Float>();
		// generation de 10 valeurs racines carrées
		for(int i=1 ; i<10 ; i++) 
		{
		float valeur = (float) Math.pow(i, 0.5);
		tableau.add(valeur);
		}
		System.out.println(tableau);
		float moy = calculerMoyenne(tableau);
		System.out.println("La moyenne est " + moy);
		}
		public static float calculerMoyenne(ArrayList<Float> valeurs) 
		{
		float moyenne = 0;
		float total = 0;
		for(float une_valeur : valeurs) {
		total = total + une_valeur;
		moyenne = total / valeurs.size();
		}
		return moyenne;
		}
		}

/* vieux code
 * 
 * public static void main(String[] args) {
ArrayList<Float> tableau = new ArrayList<Float>();
for(int i=1 ; i<10 ; i++) {
float valeur = (float) Math.pow(i, 0.5);
tableau.add(valeur);
}
System.out.println(tableau);
float moy = calculerMoyenne(tableau);
System.out.println("La moyenne est " + moy);
}
public static float calculerMoyenne(ArrayList<Float> valeurs) {
float total = 0;
for(float une_valeur : valeurs) {
total = total + une_valeur;
float moyenne = total / valeurs.size();
return moyenne;
}
return -1f;
}
}
Q3A : La fonction de retour contient un return -1f qui semble nuire au bon fonctionnement de la formule mathématique.
je crois quil fait -1 a tout les chiffres.
Q3B : Voir code corrigé. J'ai enlever le return -1f et jai aussi fait des petits ajustements dans la fonction
calculerMoyenne.
*/
