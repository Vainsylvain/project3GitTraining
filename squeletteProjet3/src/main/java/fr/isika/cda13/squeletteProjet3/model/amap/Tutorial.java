package fr.isika.cda13.squeletteProjet3.model.amap;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import java.awt.Image;

import javax.persistence.Entity;

@Entity
public class Tutorial extends Post {

@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String shortDescription;
	
//	private Image picture;
	
	public Tutorial() {
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

//	public Image getPicture() {
//		return picture;
//	}
//
//	public void setPicture(Image picture) {
//		this.picture = picture;
//	}
	
}
