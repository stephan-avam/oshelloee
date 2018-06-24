package ch.adesso.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class HelloService {

    @GET
    public String get() {
        return "Hello World!";
    }

}
