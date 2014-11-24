package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Badge {
	
	@Id
	@GeneratedValue
	@Column(name = "BADGE_ID")
	public Long id;
	
	public String name;
	public String imageURL;
	public Integer count;	
	
}
