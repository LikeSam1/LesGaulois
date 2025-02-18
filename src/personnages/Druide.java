package personnages;

import objets.Chaudron;

public class Druide {
	/* Attributs_Class */
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron(0, 0);
	
	/* Functions */
	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		this.chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté" + quantite + "Dose de potion magique. Elle a une force de " + forcePotion + ".");
	}
	
	public void boosterGaulois(Gaulois gaulois) {
		boolean reste = chaudron.resterPotion();
		String nomGaulois = gaulois.getNom();
		if(reste == true) {
			if(nomGaulois == "Astérix") {
				parler("Non " + nomGaulois + "Non ! et tu le sais très bien !");
			} else {
				int forcePotion = chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
				parler("Tiens " + nomGaulois + "Un peu de potion magique.");
			}
			
		} else {
			parler("Désolé " + nomGaulois + "il n'y a plus de potion.");
		}
	}
	
	public String getNom() {
		return nom;
	}
}
