package at.tamir.camera;

public class Camera {
    // Instance variables
    private int pixel;
    private int weight;
    private String color;

    // Constructor
    public Camera(int pixel, int weight, String color) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
    }

    // Method takePicture()
    public void takePicture() {
        System.out.println("Taking a picture...");
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
