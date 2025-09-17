public class Programmer extends Employee{

    Programmer(){
        super("Programmer");
    }

    @Override
    public void displayInfo() {
        System.out.println("Programer333");
    }

    @Override
    public double calculateSalary() {
        return 0;
    }
}
