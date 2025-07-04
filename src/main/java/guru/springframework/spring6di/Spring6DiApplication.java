package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {

        /*
            Scan for any annotated components in the package that is in and below
         */
        ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println("I'm in the main method of Spring6DiApplication");
        System.out.println(myController.sayHello());
    }

}
