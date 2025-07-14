package guru.springframework.spring6di.services.di;

import org.springframework.stereotype.Service;

@Service("setterGreetingService")
public class GreetingServiceSetterInjectedImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from the Setter Injected Service!";
    }
}
