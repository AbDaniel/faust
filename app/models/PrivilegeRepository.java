package models;

import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import org.springframework.data.repository.CrudRepository;

@Named
@Singleton
public interface PrivilegeRepository extends CrudRepository<Privilege, Long> {
	Privilege findByName(String name);
}
