package dev.vengateshm.springboot_practice.configuration;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Data
@RequiredArgsConstructor
@Configuration
public class ArtemisConfig {
    @Value("${artemis.data}")
    private String data;

    private final Environment env;
}
