package fr.isika.cda13.squeletteProjet3.devRepo;

import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import fr.isika.cda13.squeletteProjet3.model.Message;

public class MessageRepository {
	
	private EntityManager entityManager;
	
	public MessageRepository() {
        this.entityManager = HibernateUtil.createEntityManager();
    }
    
    // Sauvegarde un article en base de données
    public Long persister(Message article) {
    	EntityTransaction tx = this.entityManager.getTransaction();
        tx.begin();
        this.entityManager.persist(article);
        // On appelle le flush pour forcer l'EM a persister et 
        // affecter un identifiant à l'entité 
        this.entityManager.flush();
        tx.commit();
        return article.getId();
    }
     
    
    public void closeEntityManager() {
        entityManager.close();
    }
    
    
    
}
