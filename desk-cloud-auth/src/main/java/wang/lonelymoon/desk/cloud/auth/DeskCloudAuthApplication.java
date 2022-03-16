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
public class DeskCloudAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeskCloudAuthApplication.class, args);
    }

}
