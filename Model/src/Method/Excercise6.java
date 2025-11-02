package Method;

import java.util.Scanner;

// 输出票价, 月份,头等舱,经济舱, 计算打折之后的票价
// 5-10月,头等舱9折, 经济舱8.5折;11-4,头等舱7折,经济舱6.5折
public class Excercise6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base price: ");
        double price = sc.nextDouble();
        System.out.print("Enter month (1-12): ");
        int season = sc.nextInt();
        System.out.print("Enter cabin (1 = First, 2 = Economy): ");
        int air_class = sc.nextInt();
        if (season >= 5 && season <= 10) {
//            if (air_class == 1) {
//                price = price * 0.9;
//            } else if (air_class == 2) {
//                price = price * 0.85;
//            } else {
//                System.out.println("Invalid input");
//            }
            price = Calculator1(air_class,price,0.9,0.85);
        } else if ((season >= 1 && season <= 4) || (season >= 11 && season <= 12)) {
//            if (air_class == 1) {
//                price = price * 0.7;
//            } else if (air_class == 2) {
//                price = price * 0.65;
//            } else {
//                System.out.println("Invalid input");
//            }
            price = Calculator1(air_class,price,0.7,0.65);

        } else {
            System.out.println("Invalid input");
        }
        System.out.printf("%.2f", price);


    }

    public static double Calculator1(int air_class, double price, double v1, double v2) {
        if (air_class == 1) {
            price = price * v1;
        } else if (air_class == 2) {
            price = price * v2;
        } else {
            System.out.println("Invalid input");
        }
        return price;
    }
}
