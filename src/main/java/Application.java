import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by hocklo on 7/06/17.
 */
@SpringBootApplication
public class Application {

        public static void main(String[] args) throws Exception {
            SpringApplication.run(ApplicationController.class, args);
        }
}
