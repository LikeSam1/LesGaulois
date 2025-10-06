package test_fonctionnel;

import java.util.Iterator;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {

	public static void main(String[] args) {
		//Def character
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Gaulois obelix = new Gaulois("Ob�lix", 16);
		Romain minus = new Romain("Minus", 6);
		Romain brutus = new Romain("Brutus", 14);
		Druide panoramix = new Druide("Panoramix", 2);
		
		//Partie 1
		//asterix.parler("Bonjour Ob�lix");
		//obelix.parler("Bonjour Ast�rix. ca te dirais d'aller chasser des sangliers ?");
		//asterix.parler("Oui tr�s bonne id�e.");
		//System.out.println("Dans la foret " + asterix.toString() + " et " + obelix.toString() + " tombent nez � nez sur le romain " + minus.toString());
		
		
		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);
		}
		
	}
}
