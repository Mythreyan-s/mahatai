 class Car {
    private String make;
    private String model;
    private int year;


    public void data(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
 
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void show(){
        System.out.println("It is a car");
    }

    public void setYear(int year) {
        if (year > 1885) { 
            this.year = year;
        } else {
            System.out.println("Invalid year.");
        }
    }

    public String getInfo() {
        return year + " " + make + " " + model;
    }
}

class Bmw extends Car{
    
    public void show(){
        System.out.println("It is a bmw");
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bmw obj = new Bmw();
        System.out.println(car.getInfo()); 
        car.setYear(2023);
        car.show();
        obj.show();
        System.out.println(car.getInfo()); 
    }
}
