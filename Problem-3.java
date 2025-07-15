import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            a = a - 1;
        }

        int count = 0;
        int number = 1;

        while (count < a) {
            System.out.print(number);
            if (count < a - 1) {
                System.out.print(", ");
            }
            number += 2;
            count++;
        }
    }
}
