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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue
	@Column(name = "CAT_ID")
	public Long id;
	public String name;
	public String description;
	public String colorCode;

//	@ManyToOne(cascade = { CascadeType.ALL })
//	@JoinColumn(name = "parent_id")
//	public Category parent;
//
//	@OneToMany(mappedBy = "parent", fetch = FetchType.EAGER)
//	public List<Category> subCategories = new ArrayList<>();

}
