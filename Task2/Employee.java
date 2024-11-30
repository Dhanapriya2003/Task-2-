package Task2;

public class Employee extends Personnew{// Subclass: Employee
        int employeeID;
        double salary;

        // Constructor to initialize Employee and Person attributes
        public Employee(String name, int age, int employeeID, double salary) {
            super(name, age); // Call the constructor of the base class (Person)
            this.employeeID = employeeID;
            this.salary = salary;
        }

        // Method to display Employee details
        public void displayEmployeeDetails() {
            // Display details from the base class
            super.displayPersonDetails();
            // Display details specific to Employee
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Salary: " + salary);
        }
    }

