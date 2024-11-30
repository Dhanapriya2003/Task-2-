package Task2;

public class Person {
//    write a java program on below questions[OOP's].
//    1.1) Create a class Person with properties (name and age) with following features
//    a. Default age of person should be 18; line25
//    b. A person object can be initialized with name and age, // Person("pravin",25)
//    c. Method to display name, and age of person // line 30
    //default age 18
    String name;
    int Age;

    public Person(String Name, int age){
        name=Name;
        Age=age;
            }

    public Person(String Name){
        name=Name;
        Age=18;
    }

    public void display() {
        System.out.println("Name : "+name+"\nAge :"+Age);
    }
}
