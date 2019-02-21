package design.pattern.state;

import java.math.BigDecimal;

public abstract class AccountState {

    protected Account acc;

    public abstract void deposit(BigDecimal amount);

    public abstract void withdraw(BigDecimal amount);

    public abstract void computeInterest();

    public abstract void stateCheck();

}

//正常状态：具体状态类
class NormalState extends AccountState {
    
    public NormalState(Account acc) {
        this.acc = acc;
    }

    public NormalState(AccountState state) {
        this.acc = state.acc;
    }

    public void deposit(BigDecimal amount) {
        acc.setBalance(acc.getBalance().add(amount));
        stateCheck();
    }

    public void withdraw(BigDecimal amount) {
        acc.setBalance(acc.getBalance().subtract(amount) );
        stateCheck();
    }

    public void computeInterest() {
        System.out.println("正常状态，无须支付利息！");
    }

    // 状态转换
    public void stateCheck() {
        if (acc.getBalance().doubleValue() > -2000 && acc.getBalance().doubleValue() <= 0) {
            acc.setAccountState(new OverdraftState(this));
        } else if (acc.getBalance().doubleValue() == -2000) {
            acc.setAccountState(new RestrictedState(this));
        } else if (acc.getBalance().doubleValue() < -2000) {
            System.out.println("操作受限！");
        }
    }
}

// 透支状态：具体状态类
class OverdraftState extends AccountState {
    public OverdraftState(AccountState state) {
        this.acc = state.acc;
    }

    public void deposit(BigDecimal amount) {
        acc.setBalance(acc.getBalance().add(amount));
        stateCheck();
    }

    public void withdraw(BigDecimal amount) {
        acc.setBalance(acc.getBalance().subtract(amount) );
        stateCheck();
    }

    public void computeInterest() {
        System.out.println("计算利息！");
    }

    // 状态转换
    public void stateCheck() {
        if (acc.getBalance().doubleValue() > 0) {
            acc.setAccountState(new NormalState(this));
        } else if (acc.getBalance().doubleValue() == -2000) {
            acc.setAccountState(new RestrictedState(this));
        } else if (acc.getBalance().doubleValue() < -2000) {
            System.out.println("操作受限！");
        }
    }
}

// 受限状态：具体状态类
class RestrictedState extends AccountState {
    public RestrictedState(AccountState state) {
        this.acc = state.acc;
    }

    public void deposit(BigDecimal amount) {
        acc.setBalance(acc.getBalance().add(amount));
        stateCheck();
    }

    public void withdraw(BigDecimal amount) {
        System.out.println("帐号受限，取款失败");
    }

    public void computeInterest() {
        System.out.println("计算利息！");
    }

    // 状态转换
    public void stateCheck() {
        if (acc.getBalance().doubleValue() > 0) {
            acc.setAccountState(new NormalState(this));
        } else if (acc.getBalance().doubleValue() > -2000) {
            acc.setAccountState(new OverdraftState(this));
        }
    }
}