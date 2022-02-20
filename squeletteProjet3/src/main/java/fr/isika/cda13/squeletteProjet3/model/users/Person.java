package fr.isika.cda13.squeletteProjet3.model.users;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "PERSON_TYPE", discriminatorType = DiscriminatorType.STRING)
@NamedQueries(
		// Pk u et d'ou vient le u ?
	@NamedQuery(name = "Person.findAll", query = "select u from Person u")
)
//@formatter:off

public abstract class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	
	@Column(name = "NOM")
	protected String lastName;
	
	@Column(name = "PRENOM")
	protected String firstName;
	
	@Column(name = "AGE")
	protected String age;
	
	@Column(name = "NAISSANCE")
	protected Date birthDate;

	@Column(name = "CIVILITE")
	protected String gender;
	

	// On met insert et update à false car hibernate va gérer l'héritage lui même et mettra les valeurs qu'il faut 
	@Column(name = "PERSON_TYPE", insertable = false, updatable = false)
	protected String type;


	public Person() {
		super();
	}


	public Long getId() {
		return id;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	
	
	
}
