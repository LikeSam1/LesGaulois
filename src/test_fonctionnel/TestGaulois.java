package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {		
		/* Création_Gaulois */
		Gaulois asterix =  new Gaulois("Astérix", 8);
		Gaulois obelix =  new Gaulois("Obélix", 8);
		
		/* Création_Druide */
		Druide panoramix =  new Druide("Panoramix", 2);
		
		/* Création_Romain */
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
