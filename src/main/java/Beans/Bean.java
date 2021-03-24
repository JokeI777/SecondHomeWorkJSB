package Beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Bean {

    public LookUppedBean plug;

    @Lookup
    public LookUppedBean getLookUppedBean(){
        return null;
    }

    public LookUppedBean getPlug(){
        LookUppedBean plug = getLookUppedBean();
        return plug;
    }
}
