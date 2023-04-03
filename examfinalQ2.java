package examfinal;

public class examfinalQ2 {

	public static void main(String[] args) {
		int[] carres = new int[10];
		int[] cubes = new int[10];
		for(int i=0 ; i<carres.length ; i++) {
		carres[i] = i*i;
		cubes[i] = i*i*i;
		}
		for(int element1 : carres)
		{
			System.out.println("Les éléments du carré sont " + element1);
		}
		for(int element2 : cubes)
		{
			System.out.println("Les éléments du cube sont " + element2);
		}
		}
		}


/* vieux code
 * 
 * public static void main(String[] args) {
int[] carres = new int[10];
int[] cubes = new int[5];
for(int i=0 ; i<carres.length ; i++) {
carres[i] = i*i;
cubes[i] = i*i*i;
}
}
}
Q2A: Le probleme arrive car nous comparons un tableau de 10 cases avec un tableau de 5 cases donc quand nous arrivons
à la case 5, le tableau ne peut pu continuer vu que la prochaine case est hors de sa portée.
Q2B: Voir code corrigé. J'ai initialiser le tableau de cubes pour qu'il contienne 10 cases. J'ai aussi fait l'affichage
des valeurs vu que ce n'était pas super clair.
*/

