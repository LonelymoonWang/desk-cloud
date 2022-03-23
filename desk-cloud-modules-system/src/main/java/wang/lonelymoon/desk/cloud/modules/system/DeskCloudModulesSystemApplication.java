package wang.lonelymoon.desk.cloud.modules.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lonelymoon
 */
@SpringBootApplication
@RestController
public class DeskCloudModulesSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeskCloudModulesSystemApplication.class, args);
    }

    @RequestMapping
    public String getStr() {
        return "Hello";
    }
}
