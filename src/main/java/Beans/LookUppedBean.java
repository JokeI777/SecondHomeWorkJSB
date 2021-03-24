package Beans;

import org.springframework.stereotype.Component;

@Component
public class LookUppedBean {
    public String plug;

    public LookUppedBean(String plug){
        this.plug = plug;
    }
}
