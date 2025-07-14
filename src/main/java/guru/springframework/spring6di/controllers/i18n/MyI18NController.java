package guru.springframework.spring6di.controllers.i18n;

import guru.springframework.spring6di.services.di.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyI18NController {

    private final GreetingService greetingService;


    @Autowired
    public MyI18NController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("I'm in the sayHello method of MyI18NController");
        return greetingService.sayGreeting();
    }
}
