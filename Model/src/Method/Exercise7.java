package Method;

import java.util.Random;

// 定义方法实现随机产生一个5位的验证码,前四位是大写或者小写字母,最后一位是数字
// 方法 我们需要随机抽取数字,我们可以把数据放到数组当中, 再随机抽取一个索引
public class Exercise7 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i <= 26; i++) {
            chs[i] = (char) (i + 'a');
        }
        for (int i = 0; i < 26; i++) {
            chs[i + 26] = (char) (i + 'A');
        }
//        for (char ch : chs) {
//            System.out.print(ch);
//        }
        //随机抽取四次,也就是随机产生四次index
        String out = "";
        for (int i = 0; i < 4; i++) {
            Random r = new Random();
            out = out+chs[r.nextInt(chs.length)];
        }
       int[] num1 = {0,1,2,3,4,5,6,7,8,9,10};
        Random r1 = new Random();
        r1.nextInt(num1.length);
        out = out+num1[r1.nextInt(num1.length)];
        System.out.println(out);

    }
}
