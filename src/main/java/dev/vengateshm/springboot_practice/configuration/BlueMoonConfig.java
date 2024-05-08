package dev.vengateshm.springboot_practice.configuration;

import dev.vengateshm.springboot_practice.custom_properties_converters.Video;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Data
@Configuration
@ConfigurationProperties(prefix = "bluemoon")
public class BlueMoonConfig {
    private int id;
    private String githubRepo;
    private String description;
    private Video latestVideo;
    private List<String> playlists;
    private Map<String, Integer> nbrOfVideos;
}
