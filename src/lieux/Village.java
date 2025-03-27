package lieux;

import personnages.Gaulois;



public class Village {
	private String nom;
	private int nbVillagois = 0;
	private Gaulois chef;
	private Gaulois[] villagois; 
	
	public Village(String nom, Gaulois chef, final int NB_MAX_VILLAGOIS) {
		this.nom = nom;
		this.chef = chef;
		this.villagois = new Gaulois[NB_MAX_VILLAGOIS];
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterGaulois(Gaulois gaulois) {
		villagois[nbVillagois] = gaulois;
		nbVillagois ++;
		gaulois.ajouterVillage(this);
	}
	
	public Gaulois trouverVillagois(int numero) {
		if (nbVillagois < numero) {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
		return villagois[numero-1];
	}
	
	public void afficherVillagois() {
		System.out.println("chef : " + chef.getNom());
		
		for (int i = 0; i < nbVillagois; i++) {
			Gaulois gaulois = villagois[i];
			System.out.println("Le gaulois : " + gaulois.getNom());
			}
	}
	
}
