package wang.lonelymoon.desk.cloud.gateway;

import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.*;

import static org.springframework.boot.SpringApplication.*;

/**
 * @author lonelymoon
 */
@SpringBootApplication
@EnableEurekaClient
public class DeskCloudGatewayApplication {

    public static void main(String[] args) {
        run(DeskCloudGatewayApplication.class, args);
    }

}
