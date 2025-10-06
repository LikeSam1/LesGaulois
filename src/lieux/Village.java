package lieux;

import personnages.Gaulois;

public class Village {
	private final int NB_MAX_VILLAGEOIS = 30;
	
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois = new Gaulois[NB_MAX_VILLAGEOIS]; 
	
	public Village(String nom, Gaulois chef) {
		this.nom = nom;
		this.chef = chef;
		chef.setVillage(this);
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}
	
	public void AjouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		gaulois.setVillage(this);
		nbVillageois ++;
	}
	
	public Gaulois trouverVillageois(int numeroVillageois) {
		if (numeroVillageois <= nbVillageois) {
			return villageois[numeroVillageois - 1];
		} else {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
	}
	
	public void afficherVillage() {
		System.out.println("Le village " + "\"" + nom + "\"" + "du chef " + chef + " est composé de :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println(i + " : " + villageois[i].getNom());
		}
	}
	
	
	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", abraracourcix);
		
		Gaulois gaulois = village.trouverVillageois(30);
		
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.AjouterVillageois(asterix);
		Gaulois villageois = village.trouverVillageois(1);
		System.out.println(villageois);
		villageois = village.trouverVillageois(2);		
		
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.AjouterVillageois(obelix);
		village.afficherVillage();
		Gaulois doublepolemix = new Gaulois("Doublepolemix", 4);
		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublepolemix.sePresenter();
	}
}
