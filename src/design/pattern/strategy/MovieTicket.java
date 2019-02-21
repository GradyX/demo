package design.pattern.strategy;

public class MovieTicket {

    public double price;
    
    private Discount discount;
    
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
    
    public double getPrice() {
        return discount.calculate(price);
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
}
