package com.objis.spring.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SocieteDevLogiciel {

	private Developpeur developpeurDebutant;
	private Developpeur chefDeveloppeur;
	
	/**
	 */
	public SocieteDevLogiciel() {
		super();
	}
	
	/**
	 * @param developpeurDebutant
	 * @param chefDeveloppeur
	 */
	public SocieteDevLogiciel(Developpeur developpeurDebutant, Developpeur chefDeveloppeur) {
		super();
		this.developpeurDebutant = developpeurDebutant;
		this.chefDeveloppeur = chefDeveloppeur;
	}

	public Developpeur getDeveloppeurDebutant() { return developpeurDebutant; }
	public Developpeur getChefDeveloppeur()     { return chefDeveloppeur;     }

	public void setDeveloppeurDebutant(Developpeur developpeurDebutant) { this.developpeurDebutant = developpeurDebutant; }
	public void setChefDeveloppeur    (Developpeur chefDeveloppeur    ) { this.chefDeveloppeur     = chefDeveloppeur;     }
	
	
	@PostConstruct
	public void myPostConstruct() {
	     System.out.println("---Initialisation SocieteDEvLogiciel ---");
	     if(chefDeveloppeur != null) {
	    	 System.out.println("Bonjour Je viens d'être créé  et voici mon ChefDev:"+ chefDeveloppeur);
	     }
	}
	
	@PreDestroy
	public void myPreDestroy() {
		System.out.println("---Bye Bye SocieteDev ---");
	}
}
