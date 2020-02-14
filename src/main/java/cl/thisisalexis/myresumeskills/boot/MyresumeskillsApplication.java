package cl.thisisalexis.myresumeskills.boot;

import cl.thisisalexis.myresumeskills.configuration.MongoDbConfiguration;
import cl.thisisalexis.myresumeskills.configuration.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = "cl.thisisalexis.myresumeskills")
@Import(value = {SwaggerConfiguration.class, MongoDbConfiguration.class})
public class MyresumeskillsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyresumeskillsApplication.class, args);
	}

}
