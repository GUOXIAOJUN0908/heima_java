package Array;

public class Reverse {
    public static void main(String[] args) {
        int [] array1 = {5,6,7};
        int [] array2 =new int[array1.length];
        for(int j=0;j<array1.length;j++){
            array2[j] = array1[array1.length-j-1];
        }
        for(int i:array2){
            System.out.println(i);
        }
    }
}
