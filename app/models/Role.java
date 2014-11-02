package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
public class Role {

	@Id
	@GeneratedValue
	@Column(name = "ROLE_ID")
	private Long id;
	
	@Column(unique=true)
	private String name;
	private String description;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "ROLE_PRIV", joinColumns = { @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID") }, inverseJoinColumns = { @JoinColumn(name = "PRIV_ID", referencedColumnName = "PRIV_ID", unique = false) })
	private List<Privilege> privileges;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivilegeList(List<Privilege> privilegeList) {
		this.privileges = privilegeList;
	}

	public Role(Long id, String name, List<Privilege> privilegeList) {
		super();
		this.id = id;
		this.name = name;
		this.privileges = privilegeList;
	}

	public Role(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Role(String name, List<Privilege> privilegeList) {
		super();
		this.name = name;
		this.privileges = privilegeList;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Role() {
		super();
	}

}
