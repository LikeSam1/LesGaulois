package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {		
		/* Cr�ation_Gaulois */
		Gaulois asterix =  new Gaulois("Ast�rix", 8);
		Gaulois obelix =  new Gaulois("Ob�lix", 8);
		
		/* Cr�ation_Druide */
		Druide panoramix =  new Druide("Panoramix", 2);
		
		/* Cr�ation_Romain */
		Romain brutus = new Romain("Brutus", 14);
				
		
		/* Combat */
		panoramix.fabriquerPotion(4, 3);
		panoramix.boosterGaulois(obelix);
		panoramix.boosterGaulois(asterix);
		for(int i = 0; i < 3; i ++) {
			asterix.frapper(brutus);
		}
		
	}
}
