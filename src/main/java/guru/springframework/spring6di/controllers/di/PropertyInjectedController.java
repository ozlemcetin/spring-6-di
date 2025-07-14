package guru.springframework.spring6di.controllers.di;

import guru.springframework.spring6di.services.di.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public String sayHello() {
        System.out.println("I'm in the sayHello method of PropertyInjectedController");
        return greetingService.sayGreeting();
    }
}
