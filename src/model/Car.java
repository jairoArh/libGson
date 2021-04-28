package model;

import java.time.LocalDate;

public class Car {
    private String plate;
    private String brand;
    private short model;
    private String color;
    private double value;
    private boolean state;
    private LocalDate dateEnrollment;

    public Car(String plate, String brand, short model, String color, double value, boolean state, LocalDate dateEnrollment) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.value = value;
        this.state = state;
        this.dateEnrollment = dateEnrollment;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public short getModel() {
        return model;
    }

    public void setModel(short model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public LocalDate getDateEnrollment() {
        return dateEnrollment;
    }

    public void setDateEnrollment(LocalDate dateEnrollment) {
        this.dateEnrollment = dateEnrollment;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", model=" + model +
                ", color='" + color + '\'' +
                ", value=" + value +
                ", state=" + state +
                ", dateEnrollment=" + dateEnrollment +
                '}';
    }
}
