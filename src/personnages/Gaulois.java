package personnages;

import lieux.Village;
import objets.Equipement;

public class Gaulois {
	/* Attributs_Class */
	private String nom;
//	private int force;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	private int forcePotion = 1;
	private Village village;
	private boolean chef = false;
	
	/* Main */
	public static void main(String[] args) {		
		/* Création_Gaulois */
		Gaulois Asterix =  new Gaulois("Asterix", 8);
		
		System.out.println(Asterix);
	}
	
	/* Functions */
	@Override
	public String toString() {
		return nom;
	}
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		int frappe = this.force * this.forcePotion; 
//		romain.recevoirCoup(frappe / 3);
//		if (this.forcePotion > 1) {
//			this.forcePotion --;
//		}
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " +
		romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 3) * forcePotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
		}

	public void boirePotion(int forcePotion) {
		this.forcePotion = forcePotion;
	}
	
	public void ajouterVillage(Village village) {
		this.village = village;
	}
	
	public void ajouterChef() {
		chef = true;
	}
	
	public void sePresenter() {
		if (chef == true) {
			parler(bonjour() + nom + ". Je suis le chef le village Village des Irreductibles.");
		} else if (village == null){
			parler(bonjour() + nom + ". Je voyage de villages en villages.");
		} else {
			parler(bonjour() + nom + ". J'habite le " + village.getNom());
		}
	}
	
	private String bonjour() {
		return "Bonjour, je m'appelle ";
	}
}
	
