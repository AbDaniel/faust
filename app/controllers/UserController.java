package controllers;

import static play.libs.Json.toJson;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import models.Badge;
import models.Privilege;
import models.Role;
import models.User;

import org.springframework.transaction.annotation.Transactional;

import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import repository.PrivilegeRepository;
import repository.RoleRepository;
import repository.UserRepository;

@Named
@Singleton
public class UserController extends Controller {
	private final PrivilegeRepository privilegeRepository;
	private final RoleRepository roleRepository;
	private final UserRepository userRepository;

	@Inject
	public UserController(final PrivilegeRepository privilegeRepository,
			final RoleRepository roleRepository,
			final UserRepository userRepository) {
		this.privilegeRepository = privilegeRepository;
		this.roleRepository = roleRepository;
		this.userRepository = userRepository;
	}
	
	public Result getPrivileges() {
		return ok(toJson(privilegeRepository.findAll()));

	}

	public Result getRoles() {
		return ok(toJson(roleRepository.findAll()));
	}

	public Result addRole() {
		final Map<String, String[]> requestParameters = request().body()
				.asFormUrlEncoded();
		if (requestParameters == null) {
			return ok("Reqeust Parameter is Null");
		}
		String name = requestParameters.get("name")[0];
		String description = requestParameters.get("description")[0];
		String[] privilegeList = requestParameters.get("privileges");
		Logger.info("addRole -> "+name);
		List<Privilege> privileges = new ArrayList<>();
		for (String privilege : privilegeList) {
			privileges.add(privilegeRepository.findByName(privilege));
		}
		Role newRole = new Role();
		newRole.setName(name);
		newRole.setPrivilegeList(privileges);
		newRole.setDescription(description);
		roleRepository.save(newRole);
		return ok();
	}

	public Result getRole(String name) {
		if (name == null) {
			return ok("Reqeust Parameter is Null");
		}
		Role temp = roleRepository.findByName(name);
		if (temp == null) {
			return ok(name);
		}
		return ok(toJson(temp));
	}

	public Result getAllRoles() {
		return ok(toJson(roleRepository.findAll()));

	}

	public Result updateRole(String name) {
		final Map<String, String[]> requestParameters = request().body()
				.asFormUrlEncoded();
		Role role;
		if (requestParameters == null)
			return ok("Request Param is Null");
		String[] privileges = requestParameters.get("addPrivilege");
		String privilege = null;
		if (privileges != null)
			privilege = privileges[0];
		Privilege priv;
		if (privilege != null) {
			priv = privilegeRepository.findByName(privilege);
			role = roleRepository.findByName(name);
			role.getPrivileges().add(priv);
			roleRepository.save(role);
		} else {
			privilege = requestParameters.get("deletePrivilege")[0];
			priv = privilegeRepository.findByName(privilege);
			role = roleRepository.findByName(name);
			role.getPrivileges().remove(priv);
			roleRepository.save(role);
		}
		return ok(toJson(roleRepository.findAll()));
	}

	public Result deleteRole(String name) {
		Role role = roleRepository.findByName(name);
		roleRepository.delete(role.getId());
		return ok(toJson(roleRepository.findAll()));
	}

	@Transactional
	public Result addUser() {
		final Map<String, String[]> requestParameters = request().body()
				.asFormUrlEncoded();
		if (requestParameters == null) {
			return ok("Reqeust Parameter is Null");
		}

		String userName = requestParameters.get("userName")[0];
		String regType = requestParameters.get("regType")[0];
//		String password = requestParameters.get("password")[0];
		String firstName = requestParameters.get("firstName")[0];
		String lastName = requestParameters.get("lastName")[0];
		
		Badge one = new Badge();
		one.name = "Badge 1";
		one.name = "images/badge.png";
		Badge two = new Badge();
		two.name = "Badge 2";
		two.imageURL = "images/badge.png";
		Badge three = new Badge();
		three.name = "Badge 3";
		three.imageURL = "images/badge.png";
		
		User user = new User();
		user.id = (long) 1001;
		user.userName = userName;
		user.regType = regType;
		user.firstName = firstName;
		user.lastName = lastName;
		user.badges.add(one);
		user.badges.add(two);
		user.badges.add(three);
		Role r = roleRepository.findByName("student");
		user.roles.add(r);
		userRepository.save(user);
		return ok();
	}

	@Transactional
	public Result getUsers() {
		List<User> darn = userRepository.getAllUsersAndFetchRoles();
		return ok(toJson(darn));
	}
	
	@Transactional
	public Result getUser(String userName) {
		User darn = userRepository.getUserWithRole(userName);
		return ok(toJson(darn));
	}
	
}
