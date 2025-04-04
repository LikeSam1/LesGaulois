package personnages;

import objets.Chaudron;

public class Druide {
	/* Attributs_Class */
	private String nom;
	private Chaudron chaudron = new Chaudron(0, 0);
	
	public Druide(String nom, int force) {
		this.nom = nom;
	}
	
	/* Functions */
	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		this.chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concoct� " + quantite + " Doses de potion magique. Elle a une force de " + forcePotion + ".");
	}
	
	public void boosterGaulois(Gaulois gaulois) {
		boolean reste = chaudron.resterPotion();
		String nomGaulois = gaulois.getNom();
		if(reste) {
			if(nomGaulois == "Ob�lix") {
				parler("Non " + nomGaulois + " Non ! et tu le sais tr�s bien !");
			} else {
				int forcePotion = chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
				parler("Tiens " + nomGaulois + " Un peu de potion magique.");
			}
			
		} else {
			parler("D�sol� " + nomGaulois + " il n'y a plus de potion.");
		}
	}
	
	public String getNom() {
		return nom;
	}
}
