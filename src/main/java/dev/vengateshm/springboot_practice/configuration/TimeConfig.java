package dev.vengateshm.springboot_practice.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Data
@Configuration
@ConfigurationProperties(prefix = "zed")
public class TimeConfig {
    private Duration timeDefault;
    private Duration timeInNs;

    @DurationUnit(ChronoUnit.DAYS)
    private Duration timeInDays;
}
