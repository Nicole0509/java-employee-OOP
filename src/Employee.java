public abstract class Employee {

    public String name;

    public Employee(String name){
        this.name=name;
    }

    abstract public double calculateSalary();

    abstract public void displayInfo();
}
