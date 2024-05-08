package dev.vengateshm.springboot_practice.custom_properties_converters;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class VideoConfigConverter implements Converter<String, Video> {
    @Override
    public Video convert(String source) {
        String[] data = source.split(",");
        return new Video(Long.parseLong(data[0]), data[1], Integer.parseInt(data[2]));
    }
}
