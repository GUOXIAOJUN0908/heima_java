package Method;
// 把一个数组的元素 复制到另一个数组中
public class Exercise8 {
    public static void main(String[] args) {
        int[] x = {1,2,3,4};
        int[] y = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
        }
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
    }
}
