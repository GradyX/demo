package design.pattern.visitor;

public abstract class Employee {

    public abstract void accept(Department handle);
    
}

class FulltimeEmployee extends Employee {

    public void accept(Department handle) {
        // TODO Auto-generated method stub
        System.out.println("full time employee");
        handle.visit(this);
    }
    
}

class ParttimeEmployee extends Employee {

    public void accept(Department handle) {
        // TODO Auto-generated method stub
        System.out.println("part time employee");
        handle.visit(this);
    }
    
}