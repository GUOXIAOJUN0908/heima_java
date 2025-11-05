package test4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // 1 创建一个数组 用来存储三个汽车对象
        Cars[] arr = new Cars[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            Cars car = new Cars();
            System.out.println("请输入汽车品牌: ");
            String brand = sc.nextLine();
            car.setBrand(brand);
            System.out.println("请输入汽车价格: ");
            int price = sc.nextInt();
            sc.nextLine(); // 吸收换行符
            car.setPrice(price);
            System.out.println("请输入汽车颜色: ");
            // 或者用sc.next(), 那么就不需要添加 sc.nextLine(); // 吸收换行符,
            String color = sc.nextLine();
            car.setColour(color);
            arr[i] = car;
        }
        for(int i=0;i<arr.length;i++){
            Cars car = arr[i];
            System.out.println(car.getBrand()+","+car.getPrice()+","+car.getColour());
        }
    }
}
