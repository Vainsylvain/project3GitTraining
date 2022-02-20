package fr.isika.cda13.squeletteProjet3.model.users;

import javax.persistence.*;

@Entity
public class CreditCard {

	@Id
	@GeneratedValue
	private Long id;

	@Column(length = 50)
	private String cardName;

	@Column(length = 32)
	private String cardNumber;

	@Column(length = 32)
	private String expirationMonth;

	@Column(length = 32)
	private String expirationYear;

	@Column(length = 32)
	private String cryptogram;

	@ManyToOne
	private Subscriber subscriber;

	public CreditCard() {
	}

	public Long getId() {
		return id;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String carName) {
		this.cardName = carName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpirationMonth() {
		return expirationMonth;
	}

	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	public String getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(String expirationYear) {
		this.expirationYear = expirationYear;
	}

	public String getCryptogram() {
		return cryptogram;
	}

	public void setCryptogram(String cryptogram) {
		this.cryptogram = cryptogram;
	}


	public Subscriber getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreditCard [id=");
		builder.append(id);
		builder.append("\nCardName=");
		builder.append(cardName);
		builder.append(",\nCardNumber=");
		builder.append(cardNumber);
		builder.append("\nExpirationMonth=");
		builder.append(expirationMonth);
		builder.append("\nExpirationYear=");
		builder.append(expirationYear);
		builder.append("\nCryptogram=");
		builder.append(cryptogram);
		builder.append("\nPerson=");
		builder.append("]");
		return builder.toString();
	}

}
