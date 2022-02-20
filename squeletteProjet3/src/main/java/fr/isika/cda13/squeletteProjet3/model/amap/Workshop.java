package fr.isika.cda13.squeletteProjet3.model.amap;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Workshop extends Activity {
	
	@ManyToOne(cascade = CascadeType.ALL)
	@Column(name = "WORKSHOP_CATALOG")
	private WorkshopCatalog workshopCatalog;
	
	@Column(name = "REFERENCE")
	private String referenceWorkshop;
	
	
	public Workshop() {
		String tempRef = UUID.randomUUID().toString().substring(0, 10);
		this.referenceWorkshop = tempRef;
	}
	
	

	public WorkshopCatalog getWorkshopCatalog() {
		return workshopCatalog;
	}

	public void setWorkshopCatalog(WorkshopCatalog workshopCatalog) {
		this.workshopCatalog = workshopCatalog;
	}

	public String getReferenceWorkshop() {
		return referenceWorkshop;
	}

	public void setReferenceWorkshop(String referenceWorkshop) {
		this.referenceWorkshop = referenceWorkshop;
	}
	
	
}
