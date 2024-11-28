package at.tamir.Camera;

public class Lens {
    // Instance variables
    private String producer;
    private int focalLength;

    // Constructor
    public Lens(String producer, int focalLength) {
        this.producer = producer;
        this.focalLength = focalLength;
    }

    // Getter
    public String getProducer() {
        return producer;
    }

    public int getFocalLength() {
        return focalLength;
    }

}
