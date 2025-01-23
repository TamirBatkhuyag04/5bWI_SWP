package at.tamir.Camera;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Picture {
    // Instance variables
    private String name;
    private LocalDateTime date;
    private int size;

    // Constructor
    public Picture(String name, int size) {
        this.name = name;
        this.date = LocalDateTime.now();
        this.size = size;
    }

    // Getter

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return "Picture: " + name + ", " + size + "MB, date: " + date.format(format) + "";
    }
}
