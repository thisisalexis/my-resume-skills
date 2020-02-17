package cl.thisisalexis.myresumeskills.api;

import cl.thisisalexis.myresumeskills.domain.Skill;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Api
public interface SkillDocumentedApi extends DocumentedApi {

    @ApiOperation(value = "Get a list of all skills present")
    ResponseEntity<List<Skill>> getSkills();

    @ApiOperation(value = "Add Skills to database")
    ResponseEntity<Skill> addSkill(Skill skill);

}
