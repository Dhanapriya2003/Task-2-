package Task2;

public class Personnew {
    String name;
    int age;

    // Constructor to initialize Person attributes
    public Personnew(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
