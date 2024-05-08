package dev.vengateshm.springboot_practice.custom_properties_converters;

public class Video {
    private long id;
    private String title;
    private int lengthInSeconds;

    public Video(long id, String title, int lengthInSeconds) {
        this.id = id;
        this.title = title;
        this.lengthInSeconds = lengthInSeconds;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public void setLengthInSeconds(int lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", lengthInSeconds=" + lengthInSeconds +
                '}';
    }
}
