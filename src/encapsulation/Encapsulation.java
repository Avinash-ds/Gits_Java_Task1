package encapsulation;

class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative. Setting age to 0.");
            this.age = 0;
        }
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student("Alice", 20);

        // Access and modify data using methods (encapsulation)
        student1.displayInfo();
        student1.setAge(21);
        student1.displayInfo();

        // Attempting to access private fields directly (will result in a compilation
        // error)
        // student1.name = "Bob"; // This line would not compile
    }
}
