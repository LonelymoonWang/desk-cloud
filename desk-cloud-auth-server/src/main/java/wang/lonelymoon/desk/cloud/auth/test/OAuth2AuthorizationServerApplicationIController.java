package wang.lonelymoon.desk.cloud.auth.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuth2AuthorizationServerApplicationIController {
    private static final String CLIENT_ID = "messaging-client";

    private static final String CLIENT_SECRET = "secret";

    private final ObjectMapper objectMapper = new ObjectMapper();
}
