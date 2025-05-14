public class Attributes {
    String name;
    int age;
    String city;

    public Attributes(String name , int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public void attributes(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("City : " + city);
    }
}
