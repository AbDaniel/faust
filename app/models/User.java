package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name = "FAUSTUSER")
public class User {

	@Id
	@GeneratedValue
	public Long id;

	public String userName;

	public String regType;

	public String password;

	public String regStatus;

	public DateTime regTime;
	
	public String firstName;
	
	public String lastName;
	
	public String nickName;
	
	public String imageURL;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name = "USER_BADGE", joinColumns = { @JoinColumn(name = "id", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "BADGE_ID", referencedColumnName = "BADGE_ID", unique = false) })
	public List<Badge> badges = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "USER_ROLE", joinColumns = { @JoinColumn(name = "id", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID", unique = false) })
	public List<Role> roles = new ArrayList<>();
	
}
