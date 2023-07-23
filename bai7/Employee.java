package bai7;

public class Employee extends Person{
    double salary;
    public String getDetail() {
        String s = super.getDetail() + "," + this.salary;
        return s;
    }
}
