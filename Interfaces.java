package JAVA;

public class Interfaces implements Car {

    private String model;

    public Interfaces(String model) {
        this.model = model;
        display();
    }

    @Override
    public String model() {
        return model;
    }

    @Override
    public void display() {
        System.out.println("Car Model : "+ model());
    }
}

interface Car{
    String model();
    void display();

}
