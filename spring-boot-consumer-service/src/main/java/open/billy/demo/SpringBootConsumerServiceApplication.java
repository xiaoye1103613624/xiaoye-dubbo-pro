package open.billy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class SpringBootConsumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsumerServiceApplication.class, args);
    }

}
