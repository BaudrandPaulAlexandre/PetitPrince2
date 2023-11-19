package PetitPrince;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

public class PetitPrince0 implements Sujet{	
	
	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	private int cpt;
	
	public PetitPrince0 () {
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

}
