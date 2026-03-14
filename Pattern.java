public class Pattern {
    public static void main(String[] args) {

        int num = 1;
        for (int i = 1; i <= 5; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " "); // Print current number
                num++; // Increase number after printing
            }
            System.out.println(); // Move to next line 
        }
    }
}