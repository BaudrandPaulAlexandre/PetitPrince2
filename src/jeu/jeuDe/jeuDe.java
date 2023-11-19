package jeu.jeuDe;

import jeu.JeuSimple;

public class jeuDe extends JeuSimple{

	public jeuDe() {
		this.nom = "Dés";
	}
	
	@Override
	public int arbitrer(String c1, String c2) {
		if (Integer.parseInt(c1) > Integer.parseInt(c2)) {
			return 1; 
		} else if (Integer.parseInt(c1) < Integer.parseInt(c2)){
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String jouerUnTour() {
		String de = "";
		de += (int) (Math.random() * 6) + 1;
		return de;
	}

}
