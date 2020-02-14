package cl.thisisalexis.myresumeskills.repository;

import cl.thisisalexis.myresumeskills.domain.Skill;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkillRepository extends MongoRepository<Skill, Long> {
}
