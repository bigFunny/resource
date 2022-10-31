package payTest;

import java.util.Scanner;

public class PayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请注册您的用户:");
        System.out.print("姓名:");
        String useName = scanner2.nextLine();
        System.out.print("金额:");
        int money = scanner2.nextInt();
        My XM = new My(useName, money);
        System.out.println();
        while (true){
            System.out.println("======================");
            PayObject.list();
            System.out.println("输入您需要购买的商品名称:");
            String name = scanner.nextLine();
            if (name.equals(PayObject.APPLE.getName())){
                new Pay(PayObject.APPLE, XM);
            }else if (name.equals(PayObject.PAPER.getName())){
                new Pay(PayObject.PAPER, XM);
            }else if (name.equals(PayObject.PENCIL.getName())){
                new Pay(PayObject.PENCIL, XM);
            }else {
                System.out.println("输入错误，购买失败");
            }
            System.out.println("是否继续购买?y/n（输入n退出）");
            String yn = scanner.nextLine();
            if (yn.equals("n")|yn.equals("N")){
                break;
            }
        }
    }
}
