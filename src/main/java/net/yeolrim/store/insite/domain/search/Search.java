package net.yeolrim.store.insite.domain.search;

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
public class Search implements Serializable {
    @Id
    private String id;
}
