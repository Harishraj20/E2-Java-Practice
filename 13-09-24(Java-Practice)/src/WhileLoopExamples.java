public class WhileLoopExamples {

    // Method to print numbers from 1 to 5
    public void printNumbers() {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }

    // Method to print even numbers from 1 to 10
    public void printEvenNumbers() {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    // Method to print factorial of a number
    public void printFactorial(int number) {
        int i = 1;
        int factorial = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    public void printFibonacci(int n) {
        int a = 0, b = 1;
        int count = 0;
        while (count < n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        WhileLoopExamples example = new WhileLoopExamples();

        System.out.println("Numbers from 1 to 5:");
        example.printNumbers();

        System.out.println("Even numbers from 1 to 10:");
        example.printEvenNumbers();

        System.out.println("Factorial of 5:");
        example.printFactorial(5);

        System.out.println("Fibonacci sequence up to 8 terms:");
        example.printFibonacci(8);
    }
}
