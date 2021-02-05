package th.co.singh.config;

import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Slf4j
@Path("/api")
public class Resource {

    @Inject // Inject config class that we wanna use a value
    Config config;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        // we can get a value following the code below
        // config meaning name of Config class that we inject in
        // serverAddress meaning name of variables that we specific
        log.info("server address: " + config.serverAddress);
        log.info("server port: " + config.port);
        log.info("server user name: " + config.userName);
        log.info("server password: " + config.password);

        return "Example get value from config work!!!";
    }
}