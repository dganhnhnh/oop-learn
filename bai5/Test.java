
// import TestStatic
import static_demo.TestStatic;

public class Test {
    public static void main(String args[]) {

        TestStatic obj1 = new TestStatic();
        obj1.iStatic = 10;
        obj1.iNonStatic = 11;
        System.out.println(obj1.iStatic + "," + obj1.iNonStatic);
        TestStatic obj2 = new TestStatic();
        System.out.println(obj2.iStatic + "," + obj2.iNonStatic);
        obj2.iStatic = 12;
        System.out.println(obj1.iStatic + "," + obj1.iNonStatic);

        int[] mang = new int[10];
        int s = 0;
        int j = 0;
        for (int i : mang) {
            i = ++j;
            s += i;
        }
        for (int i : mang) {
            s += i;
                        System.out.println(i+" ");

        }
        System.out.println("s: " + s);

    }
}
