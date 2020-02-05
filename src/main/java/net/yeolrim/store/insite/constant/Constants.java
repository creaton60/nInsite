package net.yeolrim.store.insite.constant;

import org.springframework.stereotype.Repository;

@Repository
public class Constants {

    private final String clientId = "${naver.client.id}";
    private final String clientSecret = "${naver.client.secret}";

    public String getClientId() {
        return this.clientId;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }
}
