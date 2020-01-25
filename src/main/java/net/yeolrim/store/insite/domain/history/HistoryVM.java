package net.yeolrim.store.insite.domain.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.ToString;
import net.yeolrim.store.insite.domain.audience.Audience;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@ToString
public class HistoryVM {

    private String id;
    private String audienceNickName;
    private String audienceEmail;
    private LocalDateTime dateCreated;
    private LocalDateTime lastUpdated;


    public HistoryVM(History history) {
        Audience audience = history.getAudience();

        this.id = history.getId();
        this.audienceEmail = audience.getAudienceEmail();
        this.audienceNickName = audience.getAudienceNickName();
        this.dateCreated = history.getDateCreated();
        this.lastUpdated = history.getLastUpdated();
    }
}
