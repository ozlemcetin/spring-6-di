package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        System.out.println("I'm in the sayHello method of PropertyInjectedController");
        return greetingService.sayGreeting();
    }
}
