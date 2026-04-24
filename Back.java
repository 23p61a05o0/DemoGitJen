public class Back {
    // Fields (Attributes)
    private String status;

    // Constructor
    public Back(String status) {
        this.status = status;
    }

    // Method to display a message
    public void displayStatus() {
        System.out.println("Current status is: " + status);
    }

    // Main method: The entry point of the program
    public static void main(String[] args) {
        // Creating an instance of the Back class
        Back myBack = new Back("Active");
        
        // Calling a method on the object
        myBack.displayStatus();
        
        // Example of printing the class name using reflection
        System.out.println("Class Name: " + myBack.getClass().getSimpleName());
        System.out.println("All builds are successful");
    }
}
