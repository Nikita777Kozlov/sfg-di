package guru.springframework.sfgdi;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("I've created singleton bean!!!!!");
    }

    public String singletonBean(){
        return "I'm a singleton bean!";
    }

}
