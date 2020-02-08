package net.yeolrim.store.insite.domain.storage;

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
public class Storage implements Serializable {
    @Id
    private String id;

    //TODO: nInsite API 가져온 이후에 처리

}
