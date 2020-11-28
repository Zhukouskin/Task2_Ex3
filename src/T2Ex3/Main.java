package T2Ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите первое число :");
        Scanner sc = new Scanner(System.in) ;
        double a = sc.nextInt();
        System.out.println("Введите второе число :");
        int b = sc.nextInt();
        if (b == 0) {
            System.out.println("На ноль делить нельзя !!!");
        System.exit(0);
        }
        double c = a / b;
        System.out.printf("Ответ : %.2f\n" , c );
    }
}
