package guru.springframework.sfgdi.repositories;

public class EnglishGreetingService implements EnglishGreetingRepository{
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
