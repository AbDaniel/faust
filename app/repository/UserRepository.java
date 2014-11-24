package repository;


import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import models.Privilege;
import models.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Named
@Singleton
public interface UserRepository extends CrudRepository<User, Long> {
	Privilege findByUserName(String userName);
	
	@Query("FROM User u JOIN FETCH u.roles")
    public List<User> getAllUsersAndFetchRoles();
	
	@Query("FROM User u")
	public List<User> getAllUserAlone();
}
