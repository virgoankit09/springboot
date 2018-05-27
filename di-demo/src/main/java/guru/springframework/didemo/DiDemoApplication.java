package guru.springframework.didemo;

import guru.springframework.didemo.controllers.GreetingService;
import guru.springframework.didemo.controllers.GreetingServiceImpl;
import guru.springframework.didemo.controllers.MyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    @Autowired
    GreetingServiceImpl greetingService;

    public static void main(String[] args) {

       ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");
        myController.hello();
        context.getBean(DiDemoApplication.class).greetingService.show();

    }
}
