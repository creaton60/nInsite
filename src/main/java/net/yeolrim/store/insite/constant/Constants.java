package net.yeolrim.store.insite.constant;

import org.springframework.stereotype.Service;

@Service
public class Constants {

    private final String clientId = "ZbKLbYIpl_FPc8x08Gxi";
    private final String clientSecret = "EyOgY5ddDN";

    public String getClientId() {
        return this.clientId;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }
}
