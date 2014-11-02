package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;

import org.joda.time.DateTime;

@Entity
@SecondaryTable(name="USER_DETAIL",
pkJoinColumns=@PrimaryKeyJoinColumn(name="USER_ID"))
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
	
	@ManyToMany
	@JoinTable(name = "USER_ROLE", joinColumns = { @JoinColumn(name = "id") }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID") })
	public List<Role> roles = new ArrayList<>();

}
