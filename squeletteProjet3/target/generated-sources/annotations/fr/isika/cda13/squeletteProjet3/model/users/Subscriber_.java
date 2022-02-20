package fr.isika.cda13.squeletteProjet3.model.users;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Subscriber.class)
public abstract class Subscriber_ extends fr.isika.cda13.squeletteProjet3.model.users.Person_ {

	public static volatile SingularAttribute<Subscriber, String> referenceInsciption;
	public static volatile SingularAttribute<Subscriber, String> alias;
	public static volatile ListAttribute<Subscriber, CreditCard> creditCard;
	public static volatile SingularAttribute<Subscriber, Buyer> buyer;

}

