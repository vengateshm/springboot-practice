package dev.vengateshm.springboot_practice;

import dev.vengateshm.springboot_practice.configuration.ArtemisConfig;
import dev.vengateshm.springboot_practice.configuration.ArtemisConfigPrefix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootPracticeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootPracticeApplication.class, args);
        ArtemisConfig artemisConfig = context.getBean(ArtemisConfig.class);
        ArtemisConfigPrefix artemisConfigPrefix = context.getBean(ArtemisConfigPrefix.class);
        System.out.println("Artemis data : " + artemisConfig.getData());
        System.out.println("Artemis data from env : " + artemisConfig.getDataViaEnv());
        System.out.println("Artemis prefix config : " + artemisConfigPrefix.getAction());
    }

}
