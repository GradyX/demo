package design.pattern.template;

public class Client {

    public static void main(String []args) {
        Account account = new CurrentAccount();
        account.templateMethod("王斌", "901205");
    }
    
}
