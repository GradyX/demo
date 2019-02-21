package design.pattern.state;

import java.math.BigDecimal;

public class Account {

    private AccountState state;
    
    private String owner;
    
    private BigDecimal balance;
    
    public Account(String owner, BigDecimal balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    
    public void setAccountState(AccountState state) {
        this.state = state;
    }
    
    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }
    
    public void withdraw(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }
    
    public BigDecimal computeInterest() {
        return balance.multiply(new BigDecimal(0.05));
    }
    
}
