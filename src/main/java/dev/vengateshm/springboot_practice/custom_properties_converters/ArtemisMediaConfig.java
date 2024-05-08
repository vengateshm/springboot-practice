package dev.vengateshm.springboot_practice.custom_properties_converters;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "artemis.media")
public class ArtemisMediaConfig {
    private Video latestVideo;

    public Video getLatestVideo() {
        return latestVideo;
    }

    public void setLatestVideo(Video latestVideo) {
        this.latestVideo = latestVideo;
    }
}
