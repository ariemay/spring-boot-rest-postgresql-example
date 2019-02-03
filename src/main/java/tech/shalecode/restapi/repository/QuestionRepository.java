package tech.shalecode.restapi.repository;

/**
 * Created by ariemay on Feb, 2019
 */
import tech.shalecode.restapi.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
