package fr.isika.cda13.squeletteProjet3.model.users;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CreditCard.class)
public abstract class CreditCard_ {

	public static volatile SingularAttribute<CreditCard, String> expirationYear;
	public static volatile SingularAttribute<CreditCard, Subscriber> subscriber;
	public static volatile SingularAttribute<CreditCard, String> cardName;
	public static volatile SingularAttribute<CreditCard, Long> id;
	public static volatile SingularAttribute<CreditCard, String> expirationMonth;
	public static volatile SingularAttribute<CreditCard, String> cardNumber;
	public static volatile SingularAttribute<CreditCard, String> cryptogram;

}

