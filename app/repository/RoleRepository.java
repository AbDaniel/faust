package repository;

import javax.inject.Named;
import javax.inject.Singleton;

import models.Role;

import org.springframework.data.repository.CrudRepository;

@Named
@Singleton
public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByName(String name);
}
