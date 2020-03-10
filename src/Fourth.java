import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int part1;
        int part2;
        int part3;
        int part4;
        int part5;
        int part6;
        part1 = number / 100000;
        part2 = number % 100000 / 10000;
        part3 = number % 10000 / 1000;
        part4 = number % 1000 / 100;
        part5 = number % 100 / 10;
        part6 = number % 10 / 1;

        if (part1 == part6 && part2 == part5 && part3 == part4) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not");
        }
    }
}
