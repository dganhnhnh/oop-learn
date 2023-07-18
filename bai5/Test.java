// import TestStatic
import static_demo.TestStatic;

public class Test {
    public static void main(String args[]){
        // BankAccount acc1 = new BankAccount();
        // BankAccount acc2 = new BankAccount("Hana", 100);
        // System.out.println(acc1.toString());
        // System.out.println(acc2.printProperties());
        
        // Ship ship = new Ship("Going Merry", 100, 0,0,0);
        // ship.move();
        // ship.printLocation();

        // MyDate date = new MyDate();
        // System.out.println(date.millis);

        TestStatic obj1 = new TestStatic();
        obj1.iStatic = 10; obj1.iNonStatic = 11;
        System.out.println(obj1.iStatic + "," + obj1.iNonStatic);
        TestStatic obj2 = new TestStatic();
        System.out.println(obj2.iStatic + "," + obj2.iNonStatic);
        obj2.iStatic = 12;
        System.out.println(obj1.iStatic + "," + obj1.iNonStatic);
    }
}
