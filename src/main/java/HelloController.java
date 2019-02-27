import java.io.Serializable;

public class HelloController implements Serializable {

    public String sayHello() {
        return "Hello World via JSF";
    }
}