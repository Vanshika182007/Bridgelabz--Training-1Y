class Employee {
    String name;
    int id;
    double salary;

    // Method to display details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.name = "Vaishali";
        emp.id = 101;
        emp.salary = 45000;

        emp.displayDetails();
    }
}
