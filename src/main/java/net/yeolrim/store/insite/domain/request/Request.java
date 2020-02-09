package net.yeolrim.store.insite.domain.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;

import java.util.List;

@Slf4j
@Getter
@ToString
@NoArgsConstructor
public class Request {

    @Id
    private String id;
    private String startDate;
    private String endDate;
    private String timeUnit;
    private String category;
    private String keyword;
    private String device;
    private String gender;
    private List<String> ages;

    private Request(RequestDuration duration) {

    }

}
