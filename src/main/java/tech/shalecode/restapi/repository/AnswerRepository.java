package tech.shalecode.restapi.repository;

/**
 * Created by ariemay on Feb, 2019
 */
import tech.shalecode.restapi.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    List<Answer> findByQuestionId(Long questionId);
}