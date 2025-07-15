import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        int count = 0;
        int number = 1;
        while (count < a) {
            System.out.print(number);
            if (count < a - 1) {
                System.out.print(", ");
            }
            number = number + 2;
            count++;
        }
    }
}
