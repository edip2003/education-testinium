package model.constuctor;

public class Car {
    private long id;
    private String model;
    private String color;
    private int year;

    public Car(long id, int year, String model, String color) {
        this.id = id;
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public Car(long id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
