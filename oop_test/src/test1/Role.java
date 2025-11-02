package test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String toString() {
        return "Role{name = " + name + ", blood = " + blood + "}";
    }
//    Role r1=  new Role();// 这里感受到了程序员的创造性,真的是有一种创造的感受
//    Role r2=  new Role();
    // role1 去攻击 role 2

    // 定义一个方法用于攻击别人
    // 思考: 谁攻击谁
    public void attack(Role r) {
        Random rand = new Random();
        int hurt = rand.nextInt(20)+1;
        int remainBlood = r.getBlood()-hurt;
        remainBlood = remainBlood<0 ? 0 :remainBlood;
        // 修改一下挨揍人的血量
        r.setBlood(remainBlood);

        System.out.println(this.getName()+"举起拳头,打了"+r.getName()+"一下"+"造成了"+hurt+"伤害"+r.getName()+"还剩"+remainBlood+"点血");


    }

}
