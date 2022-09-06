package guru.springframework.sfgdi;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("I've created a prototype bean!!!");
    }

    public String getPrototypeBean(){
        return "I'm a prototype bean!!!";
    }
}
