//25k-3044 lab 06 task 2
public class Person {
    void displayPerson(){
        System.out.println("A person has entered FAST- NUCES uni");
    }
}
class Student extends Person{
    void displayStudent(){
        System.out.println("the person entered is a student");
    }
}
class GraduateStudent extends Student{
    void research(){
        System.out.println("the Graduated Student is conducting research");
    }
}
class UniversitySystem {
    public static void main(String[] args) {
        //creating the GraduateStudent object
        GraduateStudent g = new GraduateStudent();
        g.displayPerson();   //inherited from Person
        g.displayStudent();  //inherited from Student
        g.research();
    }
}
