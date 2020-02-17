package cl.thisisalexis.myresumeskills.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "cl.thisisalexis.myresumeskills.repository")
@EntityScan(basePackages = "cl.thisisalexis.myresumeskills.domain")
public class MongoDbConfiguration {
}
