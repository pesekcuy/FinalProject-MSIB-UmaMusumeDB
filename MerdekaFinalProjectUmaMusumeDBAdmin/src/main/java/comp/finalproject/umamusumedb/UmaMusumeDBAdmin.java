package comp.finalproject.umamusumedb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"comp.finalproject.umamusumedb"})
public class UmaMusumeDBAdmin {

    public static void main(String[] args) {
        SpringApplication.run(UmaMusumeDBAdmin.class, args);
    }

}
