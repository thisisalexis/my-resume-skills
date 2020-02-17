package cl.thisisalexis.myresumeskills.service;

import cl.thisisalexis.myresumeskills.domain.Skill;
import java.util.List;

/**
 * The type Skill service. A facade to process skills operations.
 *
 * @author thisisalexis
 * @version 1.0.0
 * @since 1.0.0
 */
public interface SkillService {

    /**
     * Gets a list with all active skills.
     *
     * @return the all skills
     */
    List<Skill> getAllSkills();


    /**
     * Add a skill.
     *
     * @param skill the skill
     * @return the just created skill
     */
    Skill addSkill(Skill skill);

}
