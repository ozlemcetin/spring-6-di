package guru.springframework.spring6di.services.i18n;

import guru.springframework.spring6di.services.di.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo! - ES Profile";
    }
}
