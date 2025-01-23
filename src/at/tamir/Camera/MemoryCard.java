package at.tamir.Camera;

import java.util.*;

public class MemoryCard {
    // Instance variables
    private double memory;
    private List<Picture> pictures;

    // Constructor
    public MemoryCard(double memory) {
        this.memory = memory;
        this.pictures = new ArrayList<>();
    }

    // Method: savePicutre
    public void savePicture(Picture picture) {
        pictures.add(picture);
    }

    public List<Picture> showAll() {
        return pictures;
    }

    // Getter
    public double getMemory() {
        return memory;
    }
}
