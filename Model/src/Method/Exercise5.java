package Method;

import java.util.Scanner;

// 输出票价, 月份,头等舱,经济舱, 计算打折之后的票价
// 5-10月,头等舱9折, 经济舱8.5折;11-4,头等舱7折,经济舱6.5折
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base price: ");
        double price = sc.nextDouble();
        System.out.print("Enter month (1-12): ");
        int season = sc.nextInt();
        System.out.print("Enter cabin (1 = First, 2 = Economy): ");
        int air_class = sc.nextInt();
        double x = priceCalculator(price, season, air_class);
        System.out.println("Your price is $" + x);
    }

    public static double priceCalculator(double price, int season, int air_class) {
        double price1 = 0;
        if (air_class == 1 && season >= 5 && season <= 10) {
            price1 = price * 0.9;

        } else if (air_class == 2 && season >= 5 && season <= 10) {
            price1 = price * 0.85;
        } else if (air_class == 1 && season >= 1 && season <= 4) {
            price1 = price * 0.7;
        } else if (air_class == 2 && season >= 1 && season <= 4) {
            price1 = price * 0.65;
        }
        return price1;
    }
}
// 写方法的时候: 我要干什么(方法体),我需要什么才能完成(形参);调用处是否继续使用方法的结果(返回值以及类型)
