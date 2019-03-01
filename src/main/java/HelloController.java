import java.io.Serializable;

public class HelloController implements Serializable {
    public String msg="";

    public String sayHello() {
        if (msg.isEmpty()){
            return "Hello World via JSF";
        }
        return "Hello " +  msg + " via JSF";
    }


    public void setMsg(String value){
        this.msg = value;
    }
}

