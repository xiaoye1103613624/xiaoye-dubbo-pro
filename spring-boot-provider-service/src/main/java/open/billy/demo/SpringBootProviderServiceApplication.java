package open.billy.demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDubbo //开启基于注解的dubbo功能
@EnableHystrix
public class SpringBootProviderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProviderServiceApplication.class, args);
        System.out.println("Provider start...");
    }


}
