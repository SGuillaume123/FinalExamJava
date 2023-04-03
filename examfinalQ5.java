package examfinal;

import java.util.ArrayList;

public class examfinalQ5 {

	public static void main(String[] args) {
		int [] tab1;
		tab1 = valueRandomizer();
	    int [] tab2;
	    tab2 = valueRandomizer();
	    commonvaluesVerifier(tab1,tab2);
	    for(int element1 : tab1)
		{
			System.out.println("les elements du tableau 1 sont " +element1);
		}
	    for(int element2 : tab2)
		{
			System.out.println("les elements du tableau 2 sont " + element2);
		}
	    
	    
	    
	    
	}
	
	/**
	 * Cette fonction g�n�re un tableau de 5 cases qui contient des valeurs al�atoire entre 1 et 5.
	 * @return ceci retourne un tableau qui est rempli de valeurs al�atoire entre 1 et 5.
	 */
	public static int[] valueRandomizer()
	{
		int[] randomizer = new int[5];
		for (int i = 0 ; i<randomizer.length ; i++) {
			int min = 1;
		    int max = 5;
		    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		    randomizer[i] = random_int;
		}
		    return randomizer;
			
	}
	/**
	 * Cette fonction analyse les donn�es de deux tableaux et ensuite v�rifie les �l�ments en commun de ces deux tableaux
	 * @param tab1 ceci est le premier tableau de 5 cases qui contient des valeurs al�atoires entre 1 et 5
	 * @param tab2 ceci est le deuxi�me tableau de 5 cases qui contient des valeurs al�atoires entre 1 et 5
	 * @return ceci retourne un tableau des valeurs communes contenues dans tab1 et tab2
	 */
	public static ArrayList<Integer> commonvaluesVerifier(int[] tab1, int[] tab2)
	{
		ArrayList<Integer> tab_communes = new ArrayList<Integer>();
		for (int i = 0; i < tab1.length; i++)
        {
            for (int j = 0; j < tab2.length; j++)
            {
                if(tab1[i] == (tab2[j]))
                {
                 System.out.println("les �l�ments communs dans les deux tableaux sont : "+(tab1[i]));
                }
            }
        }
		return tab_communes;
	}
}
/* J'ai pass� 1h � essayer diff�rentes m�thodes pour essayer de rajouter
 * les valeurs dans le tableaux dynamique sans succ�s et je suis un peu en perte
 * d'id�es sur comment proc�der donc tristement je vous remets un travail incomplet.*/

