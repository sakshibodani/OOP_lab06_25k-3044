//25k-3044 lab06 task 3
public class Employeee {
    double salary=75000.05;
    void displaySalary(){
        System.out.println("Employee Salary is: $ "+ salary);
    }
}
class PermanentEmployee extends Employeee{
    void calculateBonus(){
        double bonus= salary * 0.10;
        int castedBonus=(int)bonus;
        System.out.println("original bonus: $ "+ bonus);
        System.out.println("integer bonus: $ "+ castedBonus);
    }
}
class BonusSystem {
    public static void main(String[] args) {
        PermanentEmployee e = new PermanentEmployee();
        e.displaySalary();
        e.calculateBonus();
    }
}
