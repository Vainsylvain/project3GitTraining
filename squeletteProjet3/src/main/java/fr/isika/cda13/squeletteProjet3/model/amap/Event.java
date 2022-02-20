package fr.isika.cda13.squeletteProjet3.model.amap;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Event extends Activity {
	
	@ManyToOne(cascade = CascadeType.ALL)
	@Column(name = "EVENT_CATALOG")
	private EventCatalog eventCatalog;
	
	@Column(name = "REFERENCE")
	private String referenceEvent;
	
	
	
	public Event() {
		String tempRef = UUID.randomUUID().toString().substring(0, 10);
		this.referenceEvent = tempRef;
	}

	
	
	public EventCatalog getEventCatalog() {
		return eventCatalog;
	}

	public void setEventCatalog(EventCatalog eventCatalog) {
		this.eventCatalog = eventCatalog;
	}

	public String getReferenceEvent() {
		return referenceEvent;
	}

	public void setReferenceEvent(String referenceEvent) {
		this.referenceEvent = referenceEvent;
	}

}