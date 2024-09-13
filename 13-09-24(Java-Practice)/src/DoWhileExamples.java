public class DoWhileExamples {

    public void printNumbers() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }


    public void printEvenNumbers() {
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 10);
    }


    public void sumVal(int Val) {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (sum < Val);
        System.out.println("Sum until limit: " + sum);
    }


    public void reverseNumber(int number) {
        int reversed = 0;
        int original = number;
        do {
            reversed = reversed * 10 + (number % 10);
            number /= 10;
        } while (number > 0);
        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + reversed);
    }


    public static void main(String[] args) {
        DoWhileExamples examples = new DoWhileExamples();

        System.out.println("Printing numbers from 1 to 5:");
        examples.printNumbers();
        
        System.out.println("Printing even numbers between 1 and 10:");
        examples.printEvenNumbers();
        
        System.out.println("Summing numbers until the value (50):");
        examples.sumVal(50);
        
        System.out.println("Reversing the number 12345:");
        examples.reverseNumber(897935);

    }
}
