package repository;


import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import models.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

@Named
@Singleton
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUserName(String userName);
	
	@Query("FROM User u JOIN FETCH u.roles")
    public List<User> getAllUsersAndFetchRoles();
	
	@Query("FROM User u")
    public List<User> getAllUsers();
		
	@Query("SELECT u FROM User u JOIN FETCH u.roles WHERE LOWER(u.userName) = LOWER(:userName)")
    public User getUserWithRole(@Param("userName") String userName);
}
