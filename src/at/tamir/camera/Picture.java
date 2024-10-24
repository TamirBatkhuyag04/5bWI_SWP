package at.tamir.camera;

import java.util.Date;

public class Picture {
    // Instance variables
    private String name;
    private long date;
    private int size;

    // Constructor
    public Picture(String name, int size) {
        this.name = name;
        this.date = new Date().getTime();
        this.size = size;
    }

    // Getter
    public String getName() {
        return name;
    }

    public long getDate() {
        return date;
    }

    public int getSize() {
        return size;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
