package payTest;

public class Pay{
    private PayObject payObject;
    private My my;

    public Pay(PayObject payObject, My my) {
        this.payObject = payObject;
        this.my = my;
        paying();
    }
    public void paying(){
        int end = my.getMoney() - payObject.getPrice();
        if (end < 0){
            throw new MyException(end);
        }
        my.setMoney(end);
        System.out.println("尊敬的客户,"+my.getName() +
                "先生,您购买" + payObject.getName() +
                "成功，您还有的余额：" + my.getMoney());
    }
}
