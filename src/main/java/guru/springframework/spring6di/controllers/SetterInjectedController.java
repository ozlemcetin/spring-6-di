package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

public class SetterInjectedController {

    GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("I'm in the sayHello method of SetterInjectedController");
        return greetingService.sayGreeting();
    }
}
