package repository;


import javax.inject.Named;
import javax.inject.Singleton;

import models.Privilege;

import org.springframework.data.repository.CrudRepository;

@Named
@Singleton
public interface PrivilegeRepository extends CrudRepository<Privilege, Long> {
	Privilege findByName(String name);
}
