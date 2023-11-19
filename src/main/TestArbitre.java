package main;

import PetitPrince.Joueur;
import jeu.JeuSimple;
import jeu.JeuShifumi.JeuShifumi;
import jeu.jeuDe.jeuDe;

public class TestArbitre {
	
	public static void arbitrer(Joueur j1, Joueur j2, JeuSimple jeu) {
		String message = "";
		message += "Jouons maintenant au jeu : " + jeu.getNom();
		String J1 = jeu.jouerUnTour();
		message += "\nJ1 joue : " + J1;
		String J2 = jeu.jouerUnTour();
		message += "\nJ2 joue : " + J2;
		message += "\nGagnant : ";
		
		switch (jeu.arbitrer(J1, J2)) {
		case 1:
			message += "J1";
			break;
		
		case -1:
			message += "J2";
			break;

		default:
			message += "égalité";
			break;
		}
		System.out.println(message);
		
	}
	
	public static void main(String[] args) {
		 
		arbitrer(null, null, new jeuDe());
		arbitrer(null, null, new JeuShifumi());
	}

}
