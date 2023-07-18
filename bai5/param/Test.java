package param;

// public class Test {
//     public static void change(Student std){
//         std.setYear(1995);
//         // std = new Student("Hung", 1995);
//         }

//     public static void main(String[] args) {
//         Student std = new Student("Nam", 1990);
//         System.out.println(std.getYear());
//         change(std);
//         System.out.println(std.getYear());
//     }
// }

public class Test {
    public static int plus(int... arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(plus(1, 2, 3, 4, 5));
    }
}