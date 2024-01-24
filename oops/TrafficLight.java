package oops;

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red", 30);

        System.out.println("Current Color: " + trafficLight.getColor());
        System.out.println("Is Red? " + trafficLight.isRed());
        System.out.println("Is Green? " + trafficLight.isGreen());

        trafficLight.changeColor("green");

        System.out.println("After Changing Color:");
        System.out.println("Current Color: " + trafficLight.getColor());
        System.out.println("Is Red? " + trafficLight.isRed());
        System.out.println("Is Green? " + trafficLight.isGreen());
    }
}
