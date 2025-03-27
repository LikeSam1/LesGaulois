package personnages;

import objets.Equipement;

public class Romain {
	final int MAXEQUIPEMENT = 2;
	
	private String nom;
	private int force;
	private Equipement[] equipement;
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipement = new Equipement[MAXEQUIPEMENT];
		assert isInvariantVerified();
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
	
//	public void recevoirCoup(int forceCoup) {
//		assert forceCoup >= 0;
//		this.force -= forceCoup;
//		if(this.force < 1) {
//			System.out.println("J'abandonne !");
//		} else {
//			System.out.println("Aie !");
//		}
//		assert this.force == this.force - forceCoup;
//	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		switch (force) {
			case 0:
				parler("Aïe");
				break;
			default:
				equipementEjecte = ejecterEquipement();
				parler("J'abandonne...");
				break;
		}
		return equipementEjecte;
		}
	
	private int CalculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de" + forceCoup;
		int resistanceEquipement = 0;
		if (!(nbEquipement == 0)) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;) {
				if ((equipement[i] != null && equipement[i].equals(Equipement.BOUCLIER)) == true) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
				i++;
			}
			texte =+ resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}
	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom.toString() + " s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipement[i] == null) {
				continue;
			} else {
				equipementEjecte[nbEquipementEjecte] = equipement[i];
				nbEquipementEjecte++;
				equipement[i] = null;
			}
		}
		return equipementEjecte;
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
