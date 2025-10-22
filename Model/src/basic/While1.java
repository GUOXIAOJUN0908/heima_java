package basic;

public class While1 {
    public static void main(String[] args) {
        double p=0.1;
        int count = 0;
        int h = 8844430;
        while(p<=h){
            // 这里的*就是表示乘法
            p = p*2;
            count++;
        }
        System.out.println(count);
    }
}
