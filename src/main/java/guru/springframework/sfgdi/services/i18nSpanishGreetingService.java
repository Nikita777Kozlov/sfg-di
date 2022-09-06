package guru.springframework.sfgdi.services;

public class i18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ESP";
    }
}
