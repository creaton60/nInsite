package net.yeolrim.store.insite.domain.storage;

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
@SpringBootTest
@DisplayName("Storage domain 테스트")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StorageServiceTest {

    @Autowired
    private StorageService storageService;

    @Autowired
    private StorageRepository storageRepository;

}
