package net.yeolrim.store.insite.domain.storage;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Slf4j
@Getter
@ToString
@Document
public class Storage {
    @Id
    private String id;
}
