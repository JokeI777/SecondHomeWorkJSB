package Beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Prototype {
    public String message;

    public void setMessage(String message){this.message = message;}
    public String getMessage(){return "Message: " + message;}
}
