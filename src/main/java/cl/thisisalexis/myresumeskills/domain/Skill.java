package cl.thisisalexis.myresumeskills.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
@Document
public class Skill {
    @Id
    private Long id;
    public Integer level;
    private String name;
    private String description;
    private BigDecimal experience;

}
