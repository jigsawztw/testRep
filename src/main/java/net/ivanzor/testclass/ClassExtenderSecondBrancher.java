package net.ivanzor.testclass;

public class ClassExtenderSecondBrancher extends TestingClass {
   private long id;
    public ClassExtenderSecondBrancher(long id){
       super(id);
       this.id=id;

    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "наследних тестируемого";
    }
}
