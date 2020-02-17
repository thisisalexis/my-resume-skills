package cl.thisisalexis.myresumeskills;

import cl.thisisalexis.myresumeskills.repository.SkillRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class MyresumeskillsApplicationTests {

	@MockBean
	private SkillRepository skillRepository;

	@Test
	void contextLoads() {
	}

}
