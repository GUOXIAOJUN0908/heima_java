package test5;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        Phones[] arr = new Phones[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Phones p = new Phones();
            System.out.println("请输入品牌: ");
            String brand = sc.next();
            p.setBrand(brand);
            System.out.println("请输入颜色: ");
            String color = sc.next();
            p.setBrand(color);
            System.out.println("请输入价格: ");
            int price = sc.nextInt();
            p.setPrice(price);
            arr[i] = p;
        }
        for (int i = 0; i < arr.length; i++) {
            Phones p = arr[i];
            System.out.println(p);
        }
        double avg = avgPrice(arr);
        System.out.println(avg);
    }
    public static double avgPrice(Phones[] p) {
        double avg = 0;
        for (int i = 0; i <p.length; i++) {
            avg += p[i].getPrice();
        }
        avg = avg/p.length;
        return avg;

    }
}
