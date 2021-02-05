package th.co.singh.config;

import io.quarkus.arc.config.ConfigProperties;
import io.quarkus.runtime.annotations.ConfigItem;

@ConfigProperties(prefix = "config") // replace your prefix name here
public class Config {
    @ConfigItem(
            name = "server-address", // replace your item name here
            defaultValue = "12.111.11.111" // replace your defaultValue here
    )
    public String serverAddress;

    @ConfigItem(
            name = "port",
            defaultValue = "22"
    )
    public String port;

    @ConfigItem(
            name = "user-name",
            defaultValue = "user"
    )
    public String userName;

    @ConfigItem(
            name = "password",
            defaultValue = "1234"
    )
    public String password;
}
