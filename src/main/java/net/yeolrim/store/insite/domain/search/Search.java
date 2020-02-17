package net.yeolrim.store.insite.domain.search;

import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@ToString
@Document
public class Search implements Serializable {
    @Id
    private String id;
    private String searchText;

    @CreatedDate
    private LocalDateTime dateCreated;

    @LastModifiedDate
    private LocalDateTime lastUpdated;

    public Search(String searchText) {
        this.searchText = searchText;
    }
}
