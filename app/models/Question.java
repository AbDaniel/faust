package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {

	@Id
	@GeneratedValue
	@Column(name = "QUES_ID")
	public Long id;
	public String description;
	public String difficulty;
	
	@OneToOne (cascade=CascadeType.ALL)
	public Category category;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "OWNER_ID", referencedColumnName = "QUES_ID")
	public List<Choice> choices = new ArrayList<>();

}
