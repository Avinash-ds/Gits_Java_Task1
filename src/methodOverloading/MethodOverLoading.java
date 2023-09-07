package methodOverloading;

	
	class MathOperations {
	    // Method to add two integers
	    public int add(int a, int b) {
	        return a + b;
	    }

	    // Method to add three integers
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Method to add two double numbers
	    public double add(double a, double b) {
	        return a + b;
	    }

	    // Method to concatenate two strings
	    public String add(String str1, String str2) {
	        return str1 + str2;
	    }
	}

	
	// Main method to run the methods. call the overloaded add methods with different sets of arguments.
	public class MethodOverLoading {
	    public static void main(String[] args) {
	        MathOperations math = new MathOperations();
	    
	        // Example 1: Adding integers
	        int sum1 = math.add(5, 10);
	        // Example 2: Adding three integers
	        int sum2 = math.add(2, 3, 4);
	        // Example 3: Adding double numbers
	        double sum3 = math.add(3.5, 2.0);
	        // Example 4: Concatenating strings
	        String combinedStrings = math.add("Hello, ", "world!");

	        // Print the results
	        System.out.println("Sum of two integers: " + sum1);
	        System.out.println("Sum of three integers: " + sum2);
	        System.out.println("Sum of two doubles: " + sum3);
	        System.out.println("Concatenated strings: " + combinedStrings);
	    }
	}





