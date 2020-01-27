package net.yeolrim.store.insite.utils;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@Getter
@ToString
@Builder
@NoArgsConstructor
public class NaverBody {

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private String timeUnit;
    private String category;

    private String gender;
}
