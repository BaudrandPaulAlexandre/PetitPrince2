package PetitPrince;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

public class PetitPrince implements Sujet, Joueur{	
	
	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	private int cpt;
	
	public PetitPrince (String nom) {
		this.nom = nom;
		this.console = new ConsoleJavaBoy(this);
	}
	
	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public int getArgent() {
		return this.argent;
	}

	@Override
	public void run() {
		console.parler("J'erre");
		console.seDirigerVers(0);
		cpt++;
		console.parler("cpt = " + cpt);
		
	}

	@Override
	public void gagner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void perdre() {
		// TODO Auto-generated method stub
		
	}

}
