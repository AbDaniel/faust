package repository;


import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import models.Question;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Named
@Singleton
public interface QuestionRepository extends CrudRepository<Question , Long> {

	@Query("FROM Question u JOIN FETCH u.choices")
    public List<Question> getAllQuestionsAndChoices();
}
