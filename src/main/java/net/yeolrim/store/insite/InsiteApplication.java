package net.yeolrim.store.insite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class InsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsiteApplication.class, args);
    }

}
