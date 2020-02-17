package cl.thisisalexis.myresumeskills.repository;

import cl.thisisalexis.myresumeskills.domain.Skill;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends MongoRepository<Skill, Long> {
}
