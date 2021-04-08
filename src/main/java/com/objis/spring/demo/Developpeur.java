package com.objis.spring.demo;

public class Developpeur {

	
		private String nom;
		private int anneesExperience;
		
		/**
		 */
		public Developpeur() {
			super();
		}
	
		/**
		 * @param nom
		 * @param anneesExperience
		 */
		public Developpeur(String nom, int anneesExperience) {
			super();
			this.nom = nom;
			this.anneesExperience = anneesExperience;
		}

		public String getNom() {
			return nom;
		}

		public int getAnneesExperience() {
			return anneesExperience;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public void setAnneesExperience(int anneesExperience) {
			this.anneesExperience = anneesExperience;
		}
		
		@Override
		public String toString() {
			String description = this.nom;
			return description;
		}
		
		public void myPostConstruct() {
		     System.out.println("---Initialisation  Dev---");
		     if(nom != null) {
		    	 System.out.println("Bonjour Je viens d'être créé :"+ nom);
		     }
		}
		
		public void myPreDestroy() {
			System.out.println("---Bye Bye --- "  + nom);
		}
}
