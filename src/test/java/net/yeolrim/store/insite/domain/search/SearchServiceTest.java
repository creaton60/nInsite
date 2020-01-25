package net.yeolrim.store.insite.domain.search;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Slf4j
@ExtendWith(SpringExtension.class)
@DisplayName("검색 서비스 테스트")
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SearchServiceTest {

    @Autowired
    private SearchService searchService;

    @Autowired
    private SearchRepository searchRepository;
}
