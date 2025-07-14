package guru.springframework.spring6di.component;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LifeCycleDemoBeanTest {

    @Autowired
    LifeCycleDemoBean lifeCycleDemoBean;

    @Test
    void beanTest() {
        System.out.println("I'm in the beanTest method of LifeCycleDemoBean");
    }
}