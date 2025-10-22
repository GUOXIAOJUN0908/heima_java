package basic;
import java.util.Random;
import java.util.Scanner;

// 用户输出一个bound,然后,bound范围内的一个随机数,
// 然后用户去猜,猜对就输出猜对了,否则输出猜大了,还是猜小了
public class GuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Please enter the bound of the random number: ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int r = rand.nextInt(b); //表示0-9之前的随机数
        while(true){
            System.out.println("Pls enter a number: ");
            int n = sc.nextInt();
            if (n==r){
                System.out.println("Your Guess Was Correct!");
                break;
            } else if (n<r) {
                System.out.println("Your number is too small");

            }else{System.out.println("Your number is too big");}
        }

    }
}
