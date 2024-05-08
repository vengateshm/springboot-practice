package dev.vengateshm.springboot_practice.custom_properties_converters;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Video {
    private long id;
    private String title;
    private int lengthInSeconds;
}
