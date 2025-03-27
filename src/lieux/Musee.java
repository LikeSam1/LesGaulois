package lieux;

import objets.Equipement;
import personnages.Gaulois;

public class Musee {
	private final int MAXTROPHE = 200;
	private Equipement[] trophe;
	private int nbTrophe = 0;
	
	public Musee() {
		Equipement[] trophe = new Equipement[MAXTROPHE];
	}
	
	public void donTrophe(Gaulois gaulois, Equipement trophe) {
		if(nbTrophe < MAXTROPHE){
			this.trophe[nbTrophe] = trophe;
			nbTrophe ++;
		} else {
			System.out.println("Pas assez de place dans le musée");	
		}
	}
}
