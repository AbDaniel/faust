package repository;


import javax.inject.Named;
import javax.inject.Singleton;

import models.Choice;

import org.springframework.data.repository.CrudRepository;

@Named
@Singleton
public interface ChoiceRepository extends CrudRepository<Choice, Long> {
}
