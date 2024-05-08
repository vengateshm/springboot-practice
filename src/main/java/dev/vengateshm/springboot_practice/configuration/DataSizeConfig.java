package dev.vengateshm.springboot_practice.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

@Data
@Configuration
@ConfigurationProperties(prefix = "zed")
public class DataSizeConfig {
    private DataSize sizeDefault;
    private DataSize sizeInGB;

    @DataSizeUnit(DataUnit.TERABYTES)
    private DataSize sizeInTB;
}
