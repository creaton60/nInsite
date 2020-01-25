package net.yeolrim.store.insite.domain.history;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import net.yeolrim.store.insite.domain.audience.Audience;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Slf4j
@Getter
@ToString
@Document
public class History implements Serializable {
    @Id
    private String id;
    @DBRef
    private Audience audience;

    private String historyText;

    @CreatedDate
    private LocalDateTime dateCreated;

    @LastModifiedDate
    private LocalDateTime lastUpdated;

    public History(Audience audience, String historyText) {
        this.audience = audience;
        this.historyText = historyText;
    }
}
