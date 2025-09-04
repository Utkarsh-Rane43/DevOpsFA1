public class multiply {

    public static void main(String[] args) {
        int number = 7; // The number for which we want to print the table

        System.out.println("Multiplication Table of " + number + ":");

        // Loop from 1 to 10 to generate the table
        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " * " + i + " = " + product);
        }
    }
}
