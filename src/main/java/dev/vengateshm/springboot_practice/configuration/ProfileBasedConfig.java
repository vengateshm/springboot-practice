package dev.vengateshm.springboot_practice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileBasedConfig {

    @Bean
    @Profile("dev")
    public AppConfig devAppConfig() {
        System.out.println("Dev config bean initialized");
        return new AppConfig();
    }

    @Bean
    @Profile("prod")
    public AppConfig prodAppConfig() {
        System.out.println("Prod config bean initialized");
        return new AppConfig();
    }
}
