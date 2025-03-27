package objets;

import personnages.Gaulois;

public class Trophees {
	Gaulois gaulois;
	Equipement equipement;
	
	public Trophees(Gaulois gaulois, Equipement equipement) {
		this.gaulois = gaulois;
		this.equipement = equipement;
	}
	
	public String getNomGaulois() {
		return gaulois.getNom();
	}
}
