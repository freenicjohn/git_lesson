// Nic was here

public class Car {
    private String color;
    private String make;
    private String model;
    private static int carCount;

    public Car(String color, String make, String model) {
        this.color = color;
        this.make = make;
        this.model = model;
        carCount++;
    }

    public String getAttribute(String attribute) {
        switch (attribute.toLowerCase()) {
            case "color":
                return color;
            case "make":
                return make;
            case "model":
                return model;
            default:
                return null;
        }
    }

    public void setAttribute(String attribute, String value) {
        switch (attribute.toLowerCase()) {
            case "color":
                this.color = value;
                break;
            case "make":
                this.make = value;
                break;
            case "model":
                this.model = value;
                break;
        }
    }

    public static int getCarCount() {
        return carCount;
    }
}