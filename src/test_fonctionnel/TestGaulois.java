package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {		
		/* Création_Gaulois */
		Gaulois Asterix =  new Gaulois("Astérix", 8);
		Gaulois Obelix =  new Gaulois("Obélix", 8);
		
		/* Création_Druide */
		Druide Panoramix =  new Druide("Panoramix", 2);
		
		/* Création_Romain */
		Romain Brutus = new Romain("Brutus", 14);
				
		
		/* Combat */
		Panoramix.fabriquerPotion(4, 3);
		Panoramix.boosterGaulois(Obelix);
		Panoramix.boosterGaulois(Asterix);
		for(int i = 0; i < 3; i ++) {
			Asterix.frapper(Brutus);
		}
		
	}
}
