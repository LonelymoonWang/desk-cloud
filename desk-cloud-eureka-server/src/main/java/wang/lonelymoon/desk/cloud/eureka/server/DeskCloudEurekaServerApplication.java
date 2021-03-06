package wang.lonelymoon.desk.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * *@EnableEurekaServer 开启 Eureka server,接受其他微服务的注册
 *
 * @author lonelymoon
 */
@SpringBootApplication
@EnableEurekaServer
public class DeskCloudEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeskCloudEurekaServerApplication.class, args);
    }

}
