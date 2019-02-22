package design.pattern.visitor;

public abstract class Department {

    public abstract void visit(FulltimeEmployee employee);
    
    public abstract void visit(ParttimeEmployee employee);
    
}

class FADepartment extends Department {

    public void visit(FulltimeEmployee employee) {
        
    }
    
    public void visit(ParttimeEmployee employee) {
        
    }
    
}

class HRDepartment extends Department {

    public void visit(FulltimeEmployee employee) {
        
    }
    
    public void visit(ParttimeEmployee employee) {
        
    }
    
}