package at.tamir.Camera;

import java.util.List;

public class Camera {
    // Instance variables
    private int pixel;
    private int weight;
    private String color;
    private Producer producer;
    private Lens lens;
    private MemoryCard memoryCard;

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
        if (size == 2) {
            System.out.println("Taking small picture");
            picture = new Picture("small.png", 2);
        } else if (size == 4) {
            System.out.println("Taking medium picture");
            picture = new Picture("medium.png", 4);
        } else if (size == 8) {
            System.out.println("Taking large picture");
            picture = new Picture("large.png", 8);
        }

        if (picture != null) {
            if (!memoryCard.savePicture(picture)) {
                System.out.println("Please delete some pictures or insert a new memory card.");
            }
        }

        return picture;
    }

    // showAllPictures()
    public List<Picture> showAllPictures() {
        List<Picture> pictures = memoryCard.showAll();
        for (Picture picture : pictures) {
            System.out.println(picture);
        }
        return pictures;
    }

    // replaceMemory
    public void replaceMemoryCard(MemoryCard newMemoryCard) {
        this.memoryCard = newMemoryCard;
        System.out.println("Memory card replaced. New memory: " + newMemoryCard.getTotalMemory() + " MB.");
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

    public Lens getLens() {
        return lens;
    }

    public MemoryCard getMemoryCard() {
        return memoryCard;
    }

    public Producer getProducer() {
        return producer;
    }
}
