package net.yeolrim.store.insite.domain.search;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Slf4j
@Getter
@ToString
public class SearchHistory {

    @Id
    private String id;


    @CreatedDate
    private LocalDateTime dateCreated;
}
