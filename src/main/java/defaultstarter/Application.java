package defaultstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: Application.java
 * @Package defaultstarter
 * @Description Default starter of this simple car rental system
 * @date 2020 07-13 0:10.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
