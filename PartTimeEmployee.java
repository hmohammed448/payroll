class PartTimeEmployee extends Employee {
    private int totalWorkingHours;
    private double hourlyRate;

    public PartTimeEmployee(String name, int employeeId, int totalWorkingHours, double hourlyRate) {
        super(name, employeeId);
        this.totalWorkingHours = totalWorkingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthlySalary() {
        return totalWorkingHours * hourlyRate;
    }
}