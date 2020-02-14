package cl.thisisalexis.myresumeskills.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


/**
 * Abstract representation of Skill.
 *
 * @author thisisalexis
 * @since 1.0.0
 * @version 1.0.0
 */
@Data
@Builder
public class Skill {

    public Integer level;
    private Long id;
    private String name;
    private String description;
    private BigDecimal experience;

}
