public class Laptop {
    String brand;
    String processor;
    int ram;

    public Laptop(String brand , String processor , int ram ) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;

    }
    public Laptop(String brand , String processor  ) {
        this.brand = brand;
        this.processor = processor;


    }
    public Laptop(String brand  , int ram ) {
        this.brand = brand;
        this.ram = ram;

    }

    public String toString(){
        return " brand is " + brand + " processor is " + processor + "  ram is" + ram ;
    }
}
