package personnages;

import lieux.Village;

public class Gaulois {
	/* Attributs_Class */
	private String nom;
	private int force;
	private int forcePotion = 1;
	private Village village;
	private int numeroVillagois;
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
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		int frappe = this.force * this.forcePotion; 
		romain.recevoirCoup(frappe / 3);
		if (this.forcePotion > 1) {
			this.forcePotion --;
		}
	}

	public void boirePotion(int forcePotion) {
		this.forcePotion = forcePotion;
	}
	
	public void ajouterVillage(Village village, int numero) {
		this.village = village;
		this.numeroVillagois = numero;
	}
	
	public void ajouterChef() {
		chef = true;
	}
	
	public void sePresenter() {
		if (chef == true) {
			parler("Bonjour, je m'appelle " + nom + ". Je suis le chef le village Village des Irreductibles.");
		} else if (village == null){
			parler("Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages.");
		} else {
			parler("Bonjour, je m'appelle " + nom + ". J'habite le " + village.getNom());
		}
	}
	
}
