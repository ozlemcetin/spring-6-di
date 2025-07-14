package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyControllerTest {

    MyController myController;

    @BeforeEach
    void setUp() {
        myController = new MyController();
    }

    @Test
    void sayHello() {
        System.out.println(myController.sayHello());
    }
}