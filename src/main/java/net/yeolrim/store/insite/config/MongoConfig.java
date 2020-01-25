package net.yeolrim.store.insite.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@ComponentScan(basePackages = {"net.yeolrim.store.insite"})
@EnableConfigurationProperties(MongoProperties.class)
@EnableMongoRepositories(basePackages = {"net.yeolrim.store.insite"})
public class MongoConfig extends AbstractMongoConfiguration {

    private final MongoProperties properties;

    @Autowired
    public MongoConfig(MongoProperties properties) {
        this.properties = properties;
    }

    @Override
    public MongoClient mongoClient() {
        return new MongoClient(new MongoClientURI(properties.getUri()));
    }

    @Override
    protected String getDatabaseName() {
        return properties.getDatabase();
    }
}
