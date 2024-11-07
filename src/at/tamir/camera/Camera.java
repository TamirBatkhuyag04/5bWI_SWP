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

    // Methods
    // takePicture()
    public Picture takePicture(int size) {
        Picture picture = null;
        if (size == 1) {
            System.out.println("taking small picture");
            picture = new Picture("small.png", 2);
        } else if (size == 2) {
            System.out.println("taking medium picture");
            picture = new Picture("medium.png", 4);
        } else if (size == 3) {
            System.out.println("taking large picture");
            picture = new Picture("large.png", 8);
        }
        return picture;
    }

    // showAllPictures()
    public List<Picture> showAllPictures() {
        System.out.println("All pictures");
        List<Picture> pictures = pictures;
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
