package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {		
		/* Création_Gaulois */
		Gaulois Asterix =  new Gaulois("Astérix", 8);
		Gaulois Obelix =  new Gaulois("Obélix", 8);
		
		/* Création_Romain */
		Romain Minus = new Romain("Minus", 6);
		
		/* Variables */
		String ParoleAsterix = Asterix.prendreParole();
		String ParoleObelix = Obelix.prendreParole();
		
		/* Dialogue */
		Asterix.parler(ParoleAsterix + "Bonjour Obelix");
		Obelix.parler(ParoleObelix + "Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		Asterix.parler(ParoleAsterix + "Oui très bonne idée.");
		System.out.println("Dans la forêt " + Asterix + " et " + Obelix + " tombe nez à nez sur le romain " + Minus + ".");
		
		/* Combat */
		for(int i = 0; i < 3; i ++) {
			Asterix.frapper(Minus);
		}
		
	}
}
