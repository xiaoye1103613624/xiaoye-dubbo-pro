package open.billy.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println("Hello World!");
        classPathXmlApplicationContext.start();
        System.in.read();
    }
}
