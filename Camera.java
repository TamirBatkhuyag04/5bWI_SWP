package at.tamir.camera;

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
    // public List<Picture> showAllPictures() {
    // System.out.println("All pictures");
    // List<Picture> pictures = memoryCard.showAll();
    // for (Picture picture : pictures) {
    // System.out.println(Picture.getPicture);
    // }
    // }

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
