package Questions;
import java.util.Scanner;

public class FibonacciDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();
        
        int first = 0, second = 1, count = 0;
        
        System.out.println("First " + n + " Fibonacci numbers:");
        do {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            count++;
        } while (count < n);
        
        scanner.close();
    }
}

