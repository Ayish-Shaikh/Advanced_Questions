package Object_Oriented_Programming.Inheritance.Question_4;

public class Employee {
    private int salary;
    public Employee(int salary){
        this.salary = salary;
    }
    public void work(){
        System.out.println("Working as an Employee!");
    }
    public int getSalary(){
        return salary;
    }
}
