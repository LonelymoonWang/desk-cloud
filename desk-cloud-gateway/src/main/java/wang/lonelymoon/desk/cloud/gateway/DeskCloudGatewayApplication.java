package wang.lonelymoon.desk.cloud.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import static org.springframework.boot.SpringApplication.run;

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
