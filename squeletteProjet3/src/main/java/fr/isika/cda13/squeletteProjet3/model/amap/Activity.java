package fr.isika.cda13.squeletteProjet3.model.amap;

import java.awt.Image;
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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

	@Entity
	@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
	@DiscriminatorColumn(name = "ACTIVITY_TYPE", discriminatorType = DiscriminatorType.STRING)
	@NamedQueries({
		@NamedQuery(name = "Activity.findAll", query = "select a from Activity a")
	})
	public abstract class Activity {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		
		private String activityName;
		
		@Temporal(TemporalType.DATE)
		private Date activityDate;
		
		private int numberOfParticipants;
		
		private String shortDescription;
		
		@Lob
		private String programDescription;
		
//		private Image picture;
		
		@Column(name = "ACTIVITY_TYPE", insertable = false, updatable = false)
		private String type;
		
		

		public Activity() {
			super();
		}
		
		

		public String getActivityName() {
			return activityName;
		}

		public void setActivityName(String activityName) {
			this.activityName = activityName;
		}

		public Date getActivityDate() {
			return activityDate;
		}

		public void setActivityDate(Date activityDate) {
			this.activityDate = activityDate;
		}

		public int getNumberOfParticipants() {
			return numberOfParticipants;
		}

		public void setNumberOfParticipants(int numberOfParticipants) {
			this.numberOfParticipants = numberOfParticipants;
		}

		public String getShortDescription() {
			return shortDescription;
		}

		public void setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
		}

		public String getProgramDescription() {
			return programDescription;
		}

		public void setProgramDescription(String programDescription) {
			this.programDescription = programDescription;
		}

//		public Image getPicture() {
//			return picture;
//		}
	//
//		public void setPicture(Image picture) {
//			this.picture = picture;
//		}

		public Long getId() {
			return id;
		}

}
