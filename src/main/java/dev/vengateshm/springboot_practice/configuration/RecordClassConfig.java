package dev.vengateshm.springboot_practice.configuration;

import dev.vengateshm.springboot_practice.custom_properties_converters.Video;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "bluemoon")
public record RecordClassConfig(
        int id,
        String githubRepo,
        String description,
        Video latestVideo
) {
}
