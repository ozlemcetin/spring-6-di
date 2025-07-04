package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    //This is JUnit 5 test and is annotated with SpringBootTest

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController myController;

    @Test
    void testGetControllerFromCtx() {
        MyController myController = applicationContext.getBean(MyController.class);
        System.out.println("I'm in the context test method of Spring6DiApplicationTests");
        System.out.println(myController.sayHello());
    }


    @Test
    void testAutowireOfController() {
        System.out.println("I'm in the autowire test method of Spring6DiApplicationTests");
        System.out.println(myController.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
