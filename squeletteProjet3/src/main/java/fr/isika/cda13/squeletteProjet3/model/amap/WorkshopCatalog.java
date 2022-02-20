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
public class WorkshopCatalog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "NUMBER_OF_WORKSHOPS")
	private int numberOfWorkshops;
	
	@OneToMany
	@JoinColumn(name = "FK_WORKSHOP_ID", unique = true)
	private List<Workshop> workshops;
	
	
	
	public WorkshopCatalog() {
	}

	
	
	public int getNumberOfWorkshops() {
		return numberOfWorkshops;
	}

	public void setNumberOfWorkshops(int numberOfWorkshops) {
		this.numberOfWorkshops = numberOfWorkshops;
	}

	public void setWorkshops(List<Workshop> workshops) {
		this.workshops = workshops;
	}

	public Long getId() {
		return id;
	}	

}
