package bai7;

import java.lang.reflect.Field;

class A {
    public static int x = 10;

    public void display() {
        System.out.println(this.x);
    }
    public void printProperties() {
        Class<?> clazz = getClass();
        Field[] fields = clazz.getDeclaredFields();

        String s = new String();

        for (Field field : fields) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object fieldValue;
            try {
                fieldValue = field.get(this);
            } catch (IllegalAccessException e) {
                fieldValue = "N/A";
            }
            s += fieldName + ": " + fieldValue + "; ";
        }
        System.out.println(s);
    }
}

class B extends A {
    public int x = 20;

    
}

class Test {

    public static void main(String[] args) {
        // A b = new B();
        // b.display();
        // b.printProperties();
        A a = new B();
        B ba = (B) a;
        ba.display();
        ba.printProperties();
    }

}