//25k-3044 task 1 lab 06
public class Employee {
    void work(){
        System.out.println("Employee is working...");
    }
}
//child class: inheritance
class Manager extends Employee{
    void ManageTeam(){
        System.out.println("the manager is working with the team");
    }
}
class Main{
    public static void main(String[] args){
        Manager m1= new Manager();
        m1.work(); // child class inheriting parent class' methods.
        m1.ManageTeam();
    }
}