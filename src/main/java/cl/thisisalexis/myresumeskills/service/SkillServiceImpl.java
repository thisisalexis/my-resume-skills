package cl.thisisalexis.myresumeskills.service;

import cl.thisisalexis.myresumeskills.domain.Skill;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Random;


@Service
@Log
public class SkillServiceImpl implements SkillService {

    @Override
    public List<Skill> getAllSkills() {
        log.info("Created Skills");
        return Collections.nCopies((new Random().nextInt(30)),
                Skill.builder().id(1L).name("Java programming")
                .description("Java 8")
                .experience(BigDecimal.ONE)
                .level(10)
                .build());
    }

}
