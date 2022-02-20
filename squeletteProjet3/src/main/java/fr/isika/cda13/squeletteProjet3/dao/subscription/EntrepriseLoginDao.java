package fr.isika.cda13.squeletteProjet3.dao.subscription;

import java.util.List;
import java.util.Optional;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.isika.cda13.squeletteProjet3.model.users.Buyer;
import fr.isika.cda13.squeletteProjet3.model.users.Person;
import fr.isika.cda13.squeletteProjet3.model.users.Subscriber;

@Stateless
public class EntrepriseLoginDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	
	@SuppressWarnings("unchecked")
	public List<Subscriber> findAllSubscribers() {
		Query query = manager.createQuery("from Person U where U.type = :type");
		query.setParameter("type", "Subscriber");
		List<Subscriber> liste = query.getResultList();
		return liste;
	}
	
	@SuppressWarnings("unchecked")
	public List<Buyer> findAllBuyers() {
		Query query = manager.createQuery("from Person U where U.type = :type");
		query.setParameter("type", "Buyer");
		List<Buyer> liste = query.getResultList();
		return liste;
	}
	
	@SuppressWarnings("unchecked")
	public List<Person> rechercherToutesLesEntites() {
		List<Person> listePersonsNamedQuery = manager.createNamedQuery("Person.findAll")
				.getResultList();
		return listePersonsNamedQuery;
	}
	
	public Optional<Person> rechercheParId(Long id) {
		Person entite = null;
			entite = (Person) manager.find(Person.class, id);
		return Optional.ofNullable(entite);
	}


}
