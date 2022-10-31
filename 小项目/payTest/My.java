package payTest;

public class My {
    private String name;
    private int money;

    public My(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean identifyMoney(){
        if (money <= 0){
            System.out.println("没钱了...");
            return false;
        }
        return true;
    }
}
