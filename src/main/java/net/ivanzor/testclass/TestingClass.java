package net.ivanzor.testclass;

public class TestingClass {
    private long id;
    public TestingClass(long id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Обычный класс для теста";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
