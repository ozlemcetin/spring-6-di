package guru.springframework.spring6di.controllers.env;

import guru.springframework.spring6di.services.env.EnvironmentService;
import org.springframework.stereotype.Controller;

/**
 * Created by jt, Spring Framework Guru.
 */
@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment(){
        return "You are in " + environmentService.getEnv() + " Environment";
    }
}
