package personnages;

import lieux.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	
	public void setVillage(Village village) {
		this.village = village;
	}


	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	@Override
	public String toString() {
		return nom;
	}
	
	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la machoire de " + nomRomain);
		romain.recevoirCoup((force * effetPotion) / 3);
		if (effetPotion > 1) {
			effetPotion --;
		}
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}
	
	public void sePresenter() {
		if (village != null) {
			if (this.equals(village.getChef())) {
				parler("Bonjour, je m'appelle " + nom + ". Je suis le chef du village " + village.getNom() + ".");
			} else {
				parler("Bonjour, je m'appelle " + nom + ". J'habite le village " + village.getNom() + ".");
			}
		} else {
			parler("Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages.");
		}
	}
}
