package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;
import lieux.Village;

public class testVillage {
	public static void main(String[] args) {
		Gaulois Abraracourcix = new Gaulois("Abraracourcix", 6);
		Abraracourcix.ajouterChef();
		Village village = new Village("Village des Irréductibles", Abraracourcix, 30);
		Gaulois Asterix =  new Gaulois("Astérix", 25);
		village.ajouterGaulois(Asterix);
		village.afficherVillagois();
		Gaulois DoublePolémix =  new Gaulois("DoublePolémix", 4);
		Abraracourcix.sePresenter();
		Asterix.sePresenter();
		DoublePolémix.sePresenter();
	}
}
