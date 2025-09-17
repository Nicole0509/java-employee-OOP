//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To The Employee System!");

        Manager manager = new Manager("Tom", 40000, 2000);

        Programmer programmer = new Programmer("Liza", 3, 400);

        manager.displayInfo();
        System.out.println("Total salary:" + manager.calculateSalary());

        System.out.println();

        programmer.displayInfo();
        System.out.println("Total salary:" + programmer.calculateSalary());

    }
}