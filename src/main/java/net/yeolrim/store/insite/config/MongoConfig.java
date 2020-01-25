package net.yeolrim.store.insite.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableConfigurationProperties(MongoProperties.class)
@EnableMongoRepositories(basePackages = {"net.yeolrim.store.insite"})
public class MongoConfig extends AbstractMongoClientConfiguration {

    private final MongoProperties properties;

    @Autowired
    public MongoConfig(MongoProperties properties) {
        this.properties = properties;
    }

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create(properties.getUri());
    }

    @Override
    protected String getDatabaseName() {
        return properties.getDatabase();
    }
}
