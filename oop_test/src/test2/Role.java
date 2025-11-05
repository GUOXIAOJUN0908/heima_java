package test2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;// 长相是随机的
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美貌绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};
//    attack 攻击描述：
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，撞向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的撞向%s。",
            "%s上步抢身，招中套招，一招【鹞挂连环】，连环攻向%s。"
    };
    String[] injured_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处擦伤",
            "结果一击命中，%S痛得弯下腰",
            "结果%S痛苦地闷哼了一声，显然受了点内伤",
            "结果%s脸色发白，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果“轰”的一声，%S口中鲜血狂喷而出",
            "结果%s一声惨叫，欲避欲逃脱掉了"
    };
    public char getGender() {
        return gender;
    }

    public String getFace() {
        return face;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setFace(char gender) {
        Random rand = new Random();
        if (gender == '男') {
            int index = rand.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            int index = rand.nextInt(girlfaces.length);
            this.face = girlfaces[index];

        } else {
            this.face = "面目狰狞";
        }
    }

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
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
        int index = rand.nextInt(attacks_desc.length);
        String KongFu = attacks_desc[index];
        System.out.printf(KongFu,this.getName(),r.getName());
        System.out.println();
        int hurt = rand.nextInt(20) + 1;
        int remainBlood = r.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        // 修改一下挨揍人的血量
        r.setBlood(remainBlood);
        // 受伤的描述
        if (remainBlood > 90) {
            System.out.printf(injured_desc[0],r.getName());
        }else if (remainBlood > 80) {
            System.out.printf(injured_desc[1],r.getName());
        }else if (remainBlood > 70) {
            System.out.printf(injured_desc[2],r.getName());
        }else if (remainBlood > 60) {
            System.out.printf(injured_desc[3],r.getName());
        }else if (remainBlood > 50) {
            System.out.printf(injured_desc[4],r.getName());
        }else if (remainBlood > 40) {
            System.out.printf(injured_desc[5],r.getName());
        }else if (remainBlood > 30) {
            System.out.printf(injured_desc[6],r.getName());
        }else  if (remainBlood > 20) {
            System.out.printf(injured_desc[7],r.getName());
        }
        else{
            System.out.println(r.getName() + "已经倒地不起！");
        }
        System.out.println();
//        System.out.println(this.getName() + "举起拳头,打了" + r.getName() + "一下" + "造成了" + hurt + "伤害" + r.getName() + "还剩" + remainBlood + "点血");


    }

    public void showRoleInfo() {
        System.out.println("姓名为: " + getName());
        System.out.println("血量为: " + getBlood());
        System.out.println("性别为: " + getGender());
        System.out.println("长相为: " + getFace());
    }

}
