package design.pattern.strategy;

public class Client {

    public static void main(String[] args) {

        MovieTicket mt = new MovieTicket();
        double originalPrice = 60.0;
        double currentPrice;
        mt.setPrice(originalPrice);
        System.out.println("原始价为：" + originalPrice);
        System.out.println("---------------------------------");
        Discount discount;
        mt.setDiscount(new StudentDiscount()); //注入折扣对象
        currentPrice = mt.getPrice();
        System.out.println("折后价为：" + currentPrice);
        
    }

}
