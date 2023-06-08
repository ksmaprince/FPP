package assignment5.problem5;

import java.util.Objects;

public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    int getRamSize() {
        return ramSize;
    }

    double getProcessorSpeed() {
        return processorSpeed;
    }

    double computePower() {
        return ramSize * processorSpeed;
    }

    @Override
    public String toString() {
        return "Computer [Manufacuter: " + manufacturer + ", CPU: " + processor + ", RAM Size: " + ramSize + ", CPU Speed: " + processorSpeed + "]";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Computer computer = (Computer) object;
        return ramSize == computer.ramSize && Double.compare(computer.processorSpeed, processorSpeed) == 0 && Objects.equals(manufacturer, computer.manufacturer) && Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }
}
