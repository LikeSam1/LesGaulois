package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public Chaudron() {
		quantitePotion = 0;
		forcePotion = 0;
	}
	
	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	
	public boolean resterPotion() {
		if(quantitePotion > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int prendreLouche() {
		if (quantitePotion > 0) {
			quantitePotion --;
			return forcePotion;
		} else {
			return 0;
		}
	}
}
