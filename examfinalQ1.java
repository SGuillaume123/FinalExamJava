package examfinal;

import java.util.Scanner;

public class examfinalQ1 {

	public static void main(String[] args) {
		Scanner lecteur = new Scanner(System.in);
		System.out.println("Entrez une valeur enti�re : ");
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

/* Test 1 Entr�e : 2 sortie attendue : La valeur est divisible par 2 mais pas par 3. sortie obtenue : La valeur est divisible par 2 mais pas par 3. r�sultat: pass
 * Test 2 Entr�e: 3 sortie attendue : La valeur est divisible par 3 mais pas par 2. sortie obtenue : La valeur est divisible par 3 mais pas par 2. r�sultat : pass
 * Test 3 Entr�e : 6 sortie attendue: La valeur est divisible par 2 et par 3. sortie obtenue : La valeur est divisible par 2 et par 3. r�sultat : pass
 */

//Petite note que le programme ne fait aucune v�rification des entr�es donc il faut absolument rentrer un entier et que le else � la fin est redondant.

