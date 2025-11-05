package exercise1;

import java.util.Scanner;

// 模拟用户登录
public class demo2 {
    public static void main(String[] args) {
        String rightusername = "xiaojun";
        String rightpassword = "123456";
        // 键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);
        // 现在方法体中声明变量
        int n=0;
        while(n<3){
            System.out.println("请输入用户名: ");
            String username = sc.next();
            System.out.println("请输入密码: ");
            String password = sc.next();
            if (username.equals(rightusername) && password.equals(rightpassword)) {
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("用户名或者密码错误");
                n +=1;
            }

        }

    }
}
