package payTest;

public class MyException extends RuntimeException{
    private int money;
    public MyException(int money) {
        super("余额不足");
        this.money = money;
        System.out.println("您的余额不足，还欠" + money + "元");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
