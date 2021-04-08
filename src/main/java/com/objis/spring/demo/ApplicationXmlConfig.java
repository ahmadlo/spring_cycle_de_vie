/**
 * 
 */
package com.objis.spring.demo;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author TD
 *
 */
public class ApplicationXmlConfig {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final Logger LOGGER = Logger.getLogger(ApplicationXmlConfig.class);
		
		////////////////////////////////////////////////
		// (01.) CHARGER LE CONTEXTE DE L'APPLICATION
		//       -> A partir du fichier de définition de beans
		////////////////////////////////////////////////
		AbstractApplicationContext context = new ClassPathXmlApplicationContext ("demo-beans.xml");

		////////////////////////////////////////////////
		// (02.) RECUPERER UN BEAN
		//       -> A partir du contexte de l'application
		////////////////////////////////////////////////
		SocieteDevLogiciel societe = (SocieteDevLogiciel) context.getBean("societeDevLogiciel");
		
		////////////////////////////////////////////////
		// (03.) EXTRAIRE LES PROPRIETES DU BEAN
		////////////////////////////////////////////////
		Developpeur devDebutant = societe.getDeveloppeurDebutant();
		Developpeur chefDev = societe.getChefDeveloppeur();

		////////////////////////////////////////////////
		// (04.) AFFICHER LES PROPRIETES DU BEAN
		////////////////////////////////////////////////
		LOGGER.info("+-------------+------------------------------+");
		LOGGER.info("| NOM DU BEAN | VALEUR DU BEAN               |");
		LOGGER.info("+-------------+------------------------------+");
		LOGGER.info("| devDebutant | " + devDebutant);
		LOGGER.info("| chefDev     | " + chefDev);
		LOGGER.info("+-------------+------------------------------+");
		
		
////////////////////////////////////////////////
// (05.) Libérer Le Contexte
////////////////////////////////////////////////
		 context.registerShutdownHook();
		 
	}

}
