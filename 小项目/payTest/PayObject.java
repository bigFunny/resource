package payTest;

public enum PayObject {
    PAPER("纸张",20),APPLE("苹果",15),PENCIL("铅笔",16);
    private String name;
    private Integer price;

    PayObject(String name, Integer price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public static void list(){
        System.out.println("商品列表：\n" + PayObject.APPLE
                + '\n' + PayObject.PAPER +
                '\n' + PayObject.PENCIL);
    }

    @Override
    public String toString() {
        return name + ":\t" + price + "元" ;
    }
}
