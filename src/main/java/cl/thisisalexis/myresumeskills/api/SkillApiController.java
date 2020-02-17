package cl.thisisalexis.myresumeskills.api;

import cl.thisisalexis.myresumeskills.domain.Skill;
import cl.thisisalexis.myresumeskills.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/skills")
public class SkillApiController implements SkillDocumentedApi {

    @Autowired
    private SkillService skillService;

    @Override
    @GetMapping
    public ResponseEntity<List<Skill>> getSkills() {
        return ResponseEntity.ok(skillService.getAllSkills());
    }

    @Override
    @PostMapping
    public ResponseEntity<Skill> addSkill(@RequestBody Skill skill) {
        return null;
    }
}
