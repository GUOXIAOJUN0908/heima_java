package test6;

import java.util.Scanner;

// 1. 添加学生对象,并根据ID检查唯一性;2. 添加完毕,遍历信息;3.通过ID删除学生 4.删除完毕,遍历信息 5. 查询id=heima002的学生,并将年龄+1
public class StudentTest {
    public static void main(String[] args) {
        Students[] students = new Students[4];
        students[0] = new Students("heima001","小明",18);
        students[1] = new Students("heima002","小红",19);
        students[2] = new Students("heima003","小黄",20);
        // 需求1
//        Scanner sc = new Scanner(System.in);
//        while(true){
//            System.out.println("请输入一个学生id: ");
//
//            String id = sc.nextLine();
//            boolean flag = contains(students,id);
//            if (!flag) {
//                System.out.println("请输入一个学生姓名: ");
//                String name = sc.nextLine();
//                System.out.println("请输入学生年龄: ");
//                int age = sc.nextInt();
//                Students s = new Students(id,name,age);
//                students[3] = s;
//                break;
//            }else{System.out.println("请重新输入id");}
//        }
        // 1. 换一种思路,先创建一个数组,然后判断唯一性,如果原有数字已满,那么创建一个线的数字对象,添加
        Students a = new Students("heima004","小黄",20);
        if (!contains(students,a)){
            if (students[students.length - 1] != null){
                System.out.println("原有数组已满");
                Students[] arr1 = new Students[students.length+1];
                // 如何将一个数组的内容复制到另一个新数组
                for(int i=0;i<students.length;i++){
                    arr1[i]=students[i];
                }
                arr1[arr1.length-1]=a;
            }else {students[students.length-1]=a;}
        }else {System.out.println("id已存在");}


    }
    public static boolean contains(Students[] arr, Students a) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]!=null && arr[i].getId().equals(id)) {
//                return true;
//            }
//        }
//        return false;
        // 换一种写法,比较数组和一个对象
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null && arr[i].getId().equals(a.getId())){
                return true;
            }
        }
        return false;

    }
}
