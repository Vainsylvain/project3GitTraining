package fr.isika.cda13.squeletteProjet3.devRepo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import fr.isika.cda13.squeletteProjet3.model.users.Subscriber;
import fr.isika.cda13.squeletteProjet3.utils.DateUtils;


@Stateless
public class PersonRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void dataSet() {
		Subscriber s1 = new Subscriber();

		
		s1.setAge("26");
		s1.setAlias("Timmy");
		s1.setBirthDate(DateUtils.formDate(1991, 10, 8));
		s1.setFirstName("coucou");
		s1.setLastName("cestmoi");
		s1.setType("PERSON_TYPE");
		
		entityManager.persist(s1);
	}
}
