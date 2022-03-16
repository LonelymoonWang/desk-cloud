package wang.lonelymoon.desk.cloud.config.server;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.config.server.*;
import org.springframework.cloud.netflix.eureka.*;

/**
 * @author lonelymoon
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class DeskCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeskCloudConfigServerApplication.class, args);
    }

}
