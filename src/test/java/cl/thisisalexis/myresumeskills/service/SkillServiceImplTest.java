package cl.thisisalexis.myresumeskills.service;

import cl.thisisalexis.myresumeskills.domain.Skill;
import cl.thisisalexis.myresumeskills.repository.SkillRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SkillServiceImplTest {

    @TestConfiguration
    private static class SkillsServiceImplTestContextConfiguration {

        @Bean
        private SkillService getSkillsService() {
            return new SkillServiceImpl();
        }

    }

    @Autowired
    private SkillService skillService;

    @MockBean
    private SkillRepository skillRepository;

    @BeforeEach
    void setUp() {
        List<Skill> skills = Arrays.asList(Skill.builder().name("programming").build());
        Mockito.when(skillRepository.findAll()).thenReturn(skills);
    }

    @Test
    void getAllSkills_returnsOneSkill() {
        List<Skill> skills = skillService.getAllSkills();
        assertNotNull(skills);
    }
}