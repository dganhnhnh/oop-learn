package BT;

public class Test {
    public static void main(String[] args) {
        // S_Child sc = new S_Child();
        // S_Parent sp = new S_Parent();

        // sp = sc;
        // // sc = sp;
        // sp = new S_Child();

        Student s1 = new Student (1000, "Viet", "Bac Ninh"); 
        Student s2 = new Student (1000, "Viet", "Bac Ninh"); 
        System.out.println(s1.equals(s2));
    }
}

