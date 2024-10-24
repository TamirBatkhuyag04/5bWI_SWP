package at.tamir.camera;

import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

public class Camera {
    // Instance variables
    private int pixel;
    private int weight;
    private String color;
    private Lens lens;
    private MemoryCard memoryCard;
    private Producer producer;

    // Constructor
    public Camera(int pixel, int weight, String color, Producer producer, Lens lens, MemoryCard memoryCard) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.producer = producer;
        this.lens = lens;
        this.memoryCard = memoryCard;
    }

    // Method takePicture()
    public void takePicture() {

        Picture pic = new Picture("DEmo", 1000);
        // memoryCard.saveFile(pic);
    }

    public List<Picture> getAllPictures() {
        // return memoryCard.getAllPictures();
        return null;
    }

    // Getter
    public int getPixel() {
        return pixel;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
