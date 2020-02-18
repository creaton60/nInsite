package net.yeolrim.store.insite.domain.request;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
@Getter
@ToString
public class RequestDuration {

    private LocalDate startDate;
    private LocalDate endDate;

    public RequestDuration(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
