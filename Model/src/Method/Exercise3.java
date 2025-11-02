package Method;
// 定义一个数组,判断一个数字是否存在
public class Exercise3 {

    public static void main(String[] args) {
        int[] array2 = {1,2,3,4};
        boolean x = Match1(array2,4);
        System.out.println(x);
    }
    public static void Match(int[] array1,int a) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == a) {
                System.out.println("Yes");
                break;
            }
            }
        System.out.println("No");
        }
    // 还有一种写法,用return, 不用break
    // return 结束方法,返回结果;如果方法执行到了return,那么表示整个方法结束,里面的循环也随之结束
    public static boolean Match1(int[] array1,int a) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == a) {
                return true;
            }
        }
        return false;
    }

    }
