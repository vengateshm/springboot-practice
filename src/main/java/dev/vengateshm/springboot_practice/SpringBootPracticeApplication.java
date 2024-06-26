package dev.vengateshm.springboot_practice;

import dev.vengateshm.springboot_practice.configuration.*;
import dev.vengateshm.springboot_practice.custom_properties_converters.ArtemisMediaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringBootPracticeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootPracticeApplication.class, args);
        ArtemisConfig artemisConfig = context.getBean(ArtemisConfig.class);
        ArtemisConfigPrefix artemisConfigPrefix = context.getBean(ArtemisConfigPrefix.class);
        System.out.println("Artemis data : " + artemisConfig.getData());
        System.out.println("Artemis data from env : " + artemisConfig.getEnv().getProperty("artemis.data"));
        System.out.println("Artemis prefix config : " + artemisConfigPrefix.getAction());

        ArtemisMediaConfig artemisMediaConfig = context.getBean(ArtemisMediaConfig.class);
        System.out.println("Artemis media config : " + artemisMediaConfig.getLatestVideo().toString());

        BlueMoonConfig blueMoonConfig = context.getBean(BlueMoonConfig.class);
        System.out.println("Bluemoon config : " + blueMoonConfig);

        RecordClassConfig recordClassConfig = context.getBean(RecordClassConfig.class);
        System.out.println("Record class config : " + recordClassConfig);

        TimeConfig timeConfig = context.getBean(TimeConfig.class);
        System.out.println("Time config : " + timeConfig);

        DataSizeConfig dataSizeConfig = context.getBean(DataSizeConfig.class);
        System.out.println("Data size config : " + dataSizeConfig);
    }

}
