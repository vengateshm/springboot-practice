package dev.vengateshm.springboot_practice.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class ArtemisConfig {
    @Value("${artemis.data}")
    private String data;

    private final Environment env;

    public ArtemisConfig(Environment env) {
        this.env = env;
    }

    public String getData() {
        return data;
    }

    public String getDataViaEnv() {
        return env.getProperty("artemis.data");
    }
}
