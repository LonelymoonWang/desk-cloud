package wang.lonelymoon.desk.cloud.auth;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.openfeign.*;

/**
 * //开启 OpenFeign 功能
 *
 * @author lonelymoon
 */
@SpringBootApplication
@EnableFeignClients
//@EnableOAuth2Client
public class DeskCloudAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeskCloudAuthServerApplication.class, args);
    }

}
