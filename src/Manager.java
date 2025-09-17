public class Manager extends Employee{

    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager");
    }
}
