package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {		
		/* Cr�ation_Gaulois */
		Gaulois Asterix =  new Gaulois("Ast�rix", 8);
		Gaulois Obelix =  new Gaulois("Ob�lix", 8);
		
		/* Cr�ation_Druide */
		Druide Panoramix =  new Druide("Panoramix", 2);
		
		/* Cr�ation_Romain */
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
