package wang.lonelymoon.desk.cloud.auth.test;

import org.springframework.security.crypto.bcrypt.*;

public class GenPassword {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
        String result = encoder.encode("myPassword");
        System.out.println(result);
        System.out.println(encoder.matches("myPassword", result));
    }
}
