package guru.springframework.spring6di.controllers.ds;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

import java.util.Arrays;

//If you activate any profile explicitly, the default profile no longer applies. => Beans excluded.
@ActiveProfiles({"P", "dev", "EN"})
@SpringBootTest
class DataSourceControllerTest {

    @Autowired
    DataSourceController myDataSourceController;

    @Autowired
    Environment environment;

    @Test
    void getDataSource() {
        System.out.println(myDataSourceController.getDataSource());
        System.out.println("getActiveProfiles: " + Arrays.toString(environment.getActiveProfiles()));
        System.out.println("getDefaultProfiles: " + Arrays.toString(environment.getDefaultProfiles()));
    }
}