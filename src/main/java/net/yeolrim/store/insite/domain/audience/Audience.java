package net.yeolrim.store.insite.domain.audience;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Slf4j
@Getter
@ToString
@Document
public class Audience implements Serializable {
    @Id
    private String id;
}
