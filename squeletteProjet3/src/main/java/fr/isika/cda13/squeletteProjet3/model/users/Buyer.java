package fr.isika.cda13.squeletteProjet3.model.users;

import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Buyer extends Person {

	@Column(name = "INSCRIT")
	private Subscriber subscriber;

	@Column(name = "REFERENCE")
	private String referenceAdherent;
		
	public Buyer() {
		String tempRef = UUID.randomUUID().toString().substring(0, 10);
		this.referenceAdherent = tempRef;
	}

	public Subscriber getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	public String getReferenceAdherent() {
		return referenceAdherent;
	}

	public void setReferenceAdherent(String referenceAdherent) {
		this.referenceAdherent = referenceAdherent;
	}

}
