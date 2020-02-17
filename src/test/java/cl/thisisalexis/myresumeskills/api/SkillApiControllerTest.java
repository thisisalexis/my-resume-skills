package cl.thisisalexis.myresumeskills.api;

import cl.thisisalexis.myresumeskills.domain.Skill;
import cl.thisisalexis.myresumeskills.repository.SkillRepository;
import cl.thisisalexis.myresumeskills.service.SkillServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.CoreMatchers;
import org.hamcrest.collection.IsCollectionWithSize;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;

@WebMvcTest(SkillApiController.class)
class SkillApiControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private SkillServiceImpl skillService;

    @MockBean
    private SkillRepository skillRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void getAllSkills_shouldReturnMoraThanZeroSkills() throws Exception {
        Skill programming = Skill.builder().name("Programming").build();
        List<Skill> allSkills = Arrays.asList(programming);

        BDDMockito.given(skillService.getAllSkills()).willReturn(allSkills);

        mvc.perform(MockMvcRequestBuilders.get("/skills").contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", IsCollectionWithSize.hasSize(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name", CoreMatchers.is(programming.getName())));
    }

    @Test
    public void addASkill_addedOk() throws Exception {
        Skill programming = Skill.builder().name("Programming").id(Long.valueOf(1L)).build();
        Mockito.when(skillService.addSkill(Mockito.any())).thenReturn(programming);
        String jsonBody = objectMapper.writeValueAsString(programming);

        mvc.perform(MockMvcRequestBuilders.post("/skills").content(jsonBody).accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }


}