package test2;

public class RoleTest {
    public static void main(String[] args) {
        Role r1 = new Role("sb1", 100, '男');
        Role r2 = new Role("sb2", 100, '男');
        r1.showRoleInfo();
        r2.showRoleInfo();
        // 格斗开始
        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "K.O了" + r2.getName());
                break;
            }
            // r2开始攻击r1
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "K.O了" + r1.getName());
                break;
            }
        }
    }
}
