package cl.thisisalexis.myresumeskills.service;

import cl.thisisalexis.myresumeskills.domain.Skill;
import cl.thisisalexis.myresumeskills.repository.SkillRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/**
 * The type Skill service.
 *
 * @author thisisalexis
 * @since 1.0.0
 * @version 1.0.0
 */
@Service
@Log
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Override
    public List<Skill> getAllSkills() {
        log.info("Created Skills");

        skillRepository.findAll();

        return Collections.nCopies((new Random().nextInt(30)),
                Skill.builder().id(1L).name("Java programming")
                .description("Java 8")
                .experience(BigDecimal.ONE)
                .level(10)
                .build());
    }

    @Override
    public Skill addSkill(Skill skill) {
        return skillRepository.save(skill);
    }
}
