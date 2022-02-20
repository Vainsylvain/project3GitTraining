package fr.isika.cda13.squeletteProjet3.model.amap;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class EventCatalog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "NUMBER_OF_EVENTS")
	private int numberOfEvents;
	
	@OneToMany
	@JoinColumn(name = "FK_EVENT_ID", unique = true)
	private List<Event> events;
	
	
	
	public EventCatalog() {
	}
	
	

	public int getNumberOfEvents() {
		return numberOfEvents;
	}

	public void setNumberOfEvents(int numberOfEvents) {
		this.numberOfEvents = numberOfEvents;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public Long getId() {
		return id;
	}
	
	
}
