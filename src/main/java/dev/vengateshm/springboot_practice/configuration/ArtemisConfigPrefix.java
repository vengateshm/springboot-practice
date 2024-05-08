package dev.vengateshm.springboot_practice.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "artemis.post")
public class ArtemisConfigPrefix {
    private String action;
}
