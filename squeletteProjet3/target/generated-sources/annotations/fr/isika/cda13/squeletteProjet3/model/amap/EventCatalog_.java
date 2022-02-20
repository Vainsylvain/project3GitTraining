package fr.isika.cda13.squeletteProjet3.model.amap;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EventCatalog.class)
public abstract class EventCatalog_ {

	public static volatile SingularAttribute<EventCatalog, Long> id;
	public static volatile ListAttribute<EventCatalog, Event> events;
	public static volatile SingularAttribute<EventCatalog, Integer> numberOfEvents;

}

