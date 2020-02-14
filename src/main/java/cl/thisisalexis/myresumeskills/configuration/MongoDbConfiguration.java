package cl.thisisalexis.myresumeskills.configuration;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "cl.thisisalexis.myresumeskills.entity")
public class MongoDbConfiguration {
}
