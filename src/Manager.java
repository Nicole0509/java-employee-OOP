public class Manager extends Employee{

    double baseSalary;
    double bonus;

    public Manager(String name, double salary, double bonus){
        super(name);
        this.baseSalary=salary;
        this.bonus=bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " is a manager with a salary of " + baseSalary + " and bonus of " + bonus);
    }
}
