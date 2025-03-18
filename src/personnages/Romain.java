package personnages;

import objets.Equipement;

public class Romain {
	final int MAX_EQUIPEMENT = 2;
	
	private String nom;
	private int force;
	private Equipement[] equipement;
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipement = new Equipement[MAX_EQUIPEMENT];
		assert isInvariantVerified() == true;
	}
	
	@Override
	public String toString() {
		return nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert forceCoup >= 0;
		this.force -= forceCoup;
		if(this.force < 1) {
			System.out.println("J'abandonne !");
		} else {
			System.out.println("Aie !");
		}
		assert this.force == this.force - forceCoup;
	}
	
	private boolean isInvariantVerified() {
		return force >= 0;
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		System.out.println(minus.equipement);
	}
	
	public void sEquip(Equipement equipement) {
		
		switch(nbEquipement) {
			case 2:
				System.out.println("Le soldat " + nom + " est deja bien protéger");
			case 1 :
				if (this.equipement[nbEquipement-1] == equipement)
					System.out.println("Le soldat " + nom + " possede déjà l'equipement");
			case 0 :
				this.equipement[nbEquipement] = equipement;
				nbEquipement ++;
				System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement);
		}
	}
}
