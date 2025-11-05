package test3;

public class GoodTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("001","Pants",20,100);
        Goods g2 = new Goods("002","Dress",200,100);
        Goods g3 = new Goods("003","Shoes",300,100);
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        for(int i=0;i<arr.length;i++){
            Goods goods = arr[i];
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getStock());
        }

    }
}
