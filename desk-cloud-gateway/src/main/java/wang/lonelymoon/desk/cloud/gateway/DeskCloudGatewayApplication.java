package wang.lonelymoon.desk.cloud.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lonelymoon
 */
@SpringBootApplication
@EnableEurekaClient
@org.springframework.web.bind.annotation.RestController
public class DeskCloudGatewayApplication {

    @Value("${server.port}")
    public String serverPort;

    @org.springframework.web.bind.annotation.GetMapping
    public String gerServerPort(){
        return serverPort;
    }


    public static void main(String[] args) {
        SpringApplication.run(DeskCloudGatewayApplication.class, args);
    }

}
