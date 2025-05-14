public class Car {
    String name;
    int price;
    String colour;

    public Car(String name, int price, String colour){
        this.name = name;
        this.price = price;
        this.colour = colour;
    }

    public void displayDetails(){
        System.out.println("Car Name : " + name);
        System.out.println("Car Price : " + price);
        System.out.println("Car Colour : " + colour);

    }

}
