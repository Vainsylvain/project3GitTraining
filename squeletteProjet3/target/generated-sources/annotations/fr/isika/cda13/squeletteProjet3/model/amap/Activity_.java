package fr.isika.cda13.squeletteProjet3.model.amap;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Activity.class)
public abstract class Activity_ {

	public static volatile SingularAttribute<Activity, Integer> numberOfParticipants;
	public static volatile SingularAttribute<Activity, String> programDescription;
	public static volatile SingularAttribute<Activity, Date> activityDate;
	public static volatile SingularAttribute<Activity, String> activityName;
	public static volatile SingularAttribute<Activity, Long> id;
	public static volatile SingularAttribute<Activity, String> shortDescription;
	public static volatile SingularAttribute<Activity, String> type;

}

