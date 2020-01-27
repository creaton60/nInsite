package net.yeolrim.store.insite.utils;

import net.yeolrim.store.insite.constant.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NaverApiUtils {

    private Constants constants;

    @Autowired
    public NaverApiUtils(Constants constants) {
        this.constants = constants;
    }

    public void postHttpClients() {
        String clientId = constants.getClientId();
        String clientSecret = constants.getClientSecret();



    }
}
