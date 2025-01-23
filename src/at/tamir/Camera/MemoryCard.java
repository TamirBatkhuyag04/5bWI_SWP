package at.tamir.Camera;

import java.util.*;

public class MemoryCard {
    // Instance variables
    private double totalMemory;
    private List<Picture> pictures;

    // Constructor
    public MemoryCard(double totalMemory) {
        this.totalMemory = totalMemory; // Gesamtspeicher in MB
        this.pictures = new ArrayList<>();
    }

    // savePictures()
    public boolean savePicture(Picture picture) {
        double usedMemory = getUsedMemory();

        if (usedMemory + picture.getSize() > totalMemory) {
            System.out.println("Error: Not enough memory to save the picture!");
            return false;
        }

        pictures.add(picture);
        System.out.println(
                "Picture saved. Remaining memory: " + (totalMemory - (usedMemory + picture.getSize())) + " MB.");
        return true;
    }

    // showAll()
    public List<Picture> showAll() {
        return pictures;
    }

    public double getUsedMemory() {
        return pictures.stream().mapToDouble(Picture::getSize).sum();
    }

    public double getRemainingMemory() {
        return totalMemory - getUsedMemory();
    }

    public void clearMemory() {
        pictures.clear();
    }

    public void setTotalMemory(double totalMemory) {
        this.totalMemory = totalMemory;
    }

    public double getTotalMemory() {
        return totalMemory;
    }
}