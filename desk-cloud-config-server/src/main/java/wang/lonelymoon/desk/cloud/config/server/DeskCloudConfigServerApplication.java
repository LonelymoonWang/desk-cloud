package wang.lonelymoon.desk.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

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
