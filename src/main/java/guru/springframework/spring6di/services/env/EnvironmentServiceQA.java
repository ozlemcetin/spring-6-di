package guru.springframework.spring6di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt, Spring Framework Guru.
 */
@Profile("qa")
@Service
public class EnvironmentServiceQA implements EnvironmentService {

    @Override
    public String getEnv() {
        return "qa";
    }
}
