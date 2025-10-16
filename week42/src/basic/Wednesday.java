package basic;
import java.util.Scanner;
// 被3和5 整除的
public class Wednesday {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x,y;
        while(true){
            System.out.println("请输入开始数字: ");
            x = s.nextInt();
            System.out.println("请输入结束数字: ");
            y = s.nextInt();
            if(x<=y){
                break;
            }else {System.out.println("错误,开始数字必须小于或等于结束数字，请重新输入");}
          }
        int count=0;
        for(int i=x;i<=y;i++){
            if(i%3==0&&i%5==0){
                count++;
            }

        }
        System.out.println(count);



    }
}
