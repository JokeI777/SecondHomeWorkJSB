package Beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class Singleton {
    public String message;

    public void setMessage(String message){this.message = message;}
    public String getMessage(){return "Message: " + message;}
}
