package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {		
		/* Cr�ation_Gaulois */
		Gaulois Asterix =  new Gaulois("Ast�rix", 8);
		Gaulois Obelix =  new Gaulois("Ob�lix", 8);
		
		/* Cr�ation_Romain */
		Romain Minus = new Romain("Minus", 6);
		
		/* Variables */
		String ParoleAsterix = Asterix.prendreParole();
		String ParoleObelix = Obelix.prendreParole();
		
		/* Dialogue */
		Asterix.parler(ParoleAsterix + "Bonjour Obelix");
		Obelix.parler(ParoleObelix + "Bonjour Ast�rix. Ca te dirais d'aller chasser des sangliers ?");
		Asterix.parler(ParoleAsterix + "Oui tr�s bonne id�e.");
		System.out.println("Dans la for�t " + Asterix + " et " + Obelix + " tombe nez � nez sur le romain " + Minus + ".");
		
		/* Combat */
		for(int i = 0; i < 3; i ++) {
			Asterix.frapper(Minus);
		}
		
	}
}
