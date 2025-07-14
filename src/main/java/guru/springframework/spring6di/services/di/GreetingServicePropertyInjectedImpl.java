package guru.springframework.spring6di.services.di;

import org.springframework.stereotype.Service;

//By default: greetingServicePropertyInjectedImpl
@Service("propertyGreetingService")
public class GreetingServicePropertyInjectedImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from the Property Injected Service!";
    }
}
