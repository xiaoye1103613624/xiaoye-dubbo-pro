package open.billy.demo;

import open.billy.demo.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */

public class ConsumerApplication {
    @SuppressWarnings("resources")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        classPathXmlApplicationContext.start();
        OrderService orderService = (OrderService) classPathXmlApplicationContext.getBean("orderService");
        orderService.initOrder("12");
        System.in.read();
    }
}
