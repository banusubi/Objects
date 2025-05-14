public class Employee {
    String name;
    int id;
    int salary;

    public Employee(String name , int id , int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void employeeDetails(){
        System.out.println("Employee name : " + name);
        System.out.println("Employee id : " + id);
        System.out.println("Employee salary : " + salary);
    }
}
