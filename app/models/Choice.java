package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Choice {

	@Id
	@GeneratedValue
	@Column(name = "CHOICE_ID")
	public Long id;
	public String description;
	public Boolean rightAnswer;

	public Choice(String description) {
		super();
		this.description = description;
		rightAnswer = false;
	}

	public Choice() {
		rightAnswer = false;
	}

}
