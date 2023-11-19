package jeu.JeuShifumi;

import jeu.JeuSimple;

public class JeuShifumi extends JeuSimple{

	public JeuShifumi() {
		this.nom = "Shifumi";
	}
	
	@Override
	public int arbitrer(String c1, String c2) {
		
		if (c1.equals("PIERRE")) {
			if (c2.equals("CISEAUX")) {
				return 1;
			} else if (c2.equals("FEUILLE")) {
				return -1;
			}
		} else if (c1.equals("CISEAUX")) {
			if (c2.equals("FEUILLE")) {
				return 1;
			} else if (c2.equals("PIERRE")) {
				return -1;
			}
		} else {
			if (c2.equals("PIERRE")) {
				return 1;
			} else if (c2.equals("CISEAUX")) {
				return -1;
			} else {
				return 0;
			}
		}
		
		
		
		
		return 0;
	}

	@Override
	public String jouerUnTour() {
		String shifumi = "";
		switch ((int) (Math.random() * 3) + 1) {
		case 1:
			shifumi += Shifumi.PIERRE;
			break;
		case 2:
			shifumi += Shifumi.FEUILLE;
			break;
		default:
			shifumi += Shifumi.CISEAUX;
			break;
		}
		return shifumi;
	}

}
