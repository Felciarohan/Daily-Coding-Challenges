import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int digits = 0;
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        temp = num;
        while (temp != 0) {
            int remainder = temp % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power = power * remainder;
            }
            sum = sum + power;
            temp = temp / 10;
        }
        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}