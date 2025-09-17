public class Programmer extends Employee{

    int workingHours;
    double ratePerHour;

    Programmer(String name,  int workingHours, double ratePerHour) {
        super(name);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " is a programmer working " + workingHours + " hours per day and at an hourly of " + ratePerHour +"$  .");
    }

    @Override
    public double calculateSalary() {
        return (double)workingHours * ratePerHour;
    }
}
