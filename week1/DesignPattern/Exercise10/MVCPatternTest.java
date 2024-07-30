package week1.DesignPattern.Exercise10;

public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a Student model
        Student student = new Student("John Doe", "1234", "A");

        // Create a StudentView
        StudentView view = new StudentView();

        // Create a StudentController
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        System.out.println("Initial student details:");
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");

        // Display updated student details
        System.out.println("\nUpdated student details:");
        controller.updateView();
    }
}
