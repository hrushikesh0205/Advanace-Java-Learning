public class throw_exception {

    public static void checkMarks(int marks)
    { 
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks between 0 to 100");
        }
        System.out.println("Your marks: " + marks);
    }

    public static void main(String[] args) {
        try {
            checkMarks(150);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program end!!");
        }
    }
}