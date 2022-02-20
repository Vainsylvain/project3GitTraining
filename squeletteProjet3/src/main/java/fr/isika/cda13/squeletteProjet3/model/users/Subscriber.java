package fr.isika.cda13.squeletteProjet3.model.users;

import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Subscriber extends Person {


	@Column(name = "ALIAS")
	private String alias;

	@Column(name = "REFERENCE")
	private String referenceInsciption;
	
	@OneToMany
	private List<CreditCard> creditCard;
	
	@OneToOne
	private Buyer buyer;
	
	public Subscriber() {
		String tempRef = UUID.randomUUID().toString().substring(0, 10);
		this.referenceInsciption = tempRef;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getReferenceSubscriber() {
		return referenceInsciption;
	}

	public void setReferenceSubscriber(String referenceInsciption) {
		this.referenceInsciption = referenceInsciption;
	}

}
