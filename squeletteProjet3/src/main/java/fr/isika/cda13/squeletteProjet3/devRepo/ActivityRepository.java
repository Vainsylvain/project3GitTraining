package fr.isika.cda13.squeletteProjet3.devRepo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.isika.cda13.squeletteProjet3.model.amap.Activity;

public class ActivityRepository {
	
	private EntityManager entityManager;
	
	public ActivityRepository() {
	        this.entityManager = HibernateUtil.createEntityManager();
	    }
	    
	    // Sauvegarde un article en base de données
	    public Long persister(Activity activity) {
	    	EntityTransaction tx = this.entityManager.getTransaction();
	        tx.begin();
	        this.entityManager.persist(activity);
	        // On appelle le flush pour forcer l'EM a persister et 
	        // affecter un identifiant à l'entité 
	        this.entityManager.flush();
	        tx.commit();
	        return activity.getId();
	    }
	     
	    
	    public void closeEntityManager() {
	        entityManager.close();
	    }

}
