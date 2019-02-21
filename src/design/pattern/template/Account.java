package design.pattern.template;

public abstract class Account {

    private String name;
    
    protected double balance;
    
    public boolean validate(String name, String password) {
        if(name.equals("王斌") && password.equals("901205")) {
            this.name = name; 
            this.balance = 10000;
            return true;
        }
        else {
            return false;
        }
    }
    
    public void display() {
        System.out.println("您好，" + this.name);
    }
    
    public abstract void calculateInterest();
    
    public void templateMethod(String name, String password) {
        
        if(!validate(name, password)) {
            System.out.println("用户名或密码错误");
            return;
        }
        calculateInterest();
        display();
        
    }
            
}

class CurrentAccount extends Account {

    public void calculateInterest() {
        System.out.println("活期利息:" + this.balance * 0.05);
    }
    
}

class SavingAccount extends Account {

    public void calculateInterest() {
        System.out.println("定期利息:" + this.balance * 0.1);
    }
    
}
