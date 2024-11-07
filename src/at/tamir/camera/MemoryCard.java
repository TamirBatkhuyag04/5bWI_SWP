package at.tamir.camera;

import java.util.*;

public class MemoryCard {
    // Instance variables
    private double memory;
    private List<Picture> pictures;

    // Constructor
    public MemoryCard(double memory) {
        this.memory = memory;
    }

    // Method: savePicutre
    public void savePicture(Picture picture) {
        pictures.add(picture);
    }

    // Getter
    public double getMemory() {
        return memory;
    }
}
