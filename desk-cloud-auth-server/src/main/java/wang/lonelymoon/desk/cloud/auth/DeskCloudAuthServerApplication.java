package wang.lonelymoon.desk.cloud.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

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
