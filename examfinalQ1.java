package examfinal;

import java.util.Scanner;

public class examfinalQ1 {

	public static void main(String[] args) {
		Scanner lecteur = new Scanner(System.in);
		System.out.println("Entrez une valeur entière : ");
		int valeur = lecteur.nextInt();
		if (valeur%2==0) {
		if (valeur%3==0) {
		System.out.println("La valeur est divisible par 2 et par 3.");
		}
		else {
		System.out.println("La valeur est divisible par 2 mais pas par 3.");
		}
		}
		else if (valeur%3==0) {
		System.out.println("La valeur est divisible par 3 mais pas par 2.");
		}
		else {
		System.out.println("La valeur est divisible par 2 et par 3.");
		}
		lecteur.close();
		}
		}

/* Test 1 Entrée : 2 sortie attendue : La valeur est divisible par 2 mais pas par 3. sortie obtenue : La valeur est divisible par 2 mais pas par 3. résultat: pass
 * Test 2 Entrée: 3 sortie attendue : La valeur est divisible par 3 mais pas par 2. sortie obtenue : La valeur est divisible par 3 mais pas par 2. résultat : pass
 * Test 3 Entrée : 6 sortie attendue: La valeur est divisible par 2 et par 3. sortie obtenue : La valeur est divisible par 2 et par 3. résultat : pass
 */

//Petite note que le programme ne fait aucune vérification des entrées donc il faut absolument rentrer un entier et que le else à la fin est redondant.

