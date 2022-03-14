package wang.lonelymoon.desk.cloud.modules.system;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

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
