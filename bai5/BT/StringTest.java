package BT;

public class StringTest {
    public static void main(String args[]){
        long start = System.currentTimeMillis();
        // // String
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s+= "a";
        }

        // // StringBuffer
        // StringBuffer sb = new StringBuffer();
        // for (int i = 0; i < 100000; i++) {
        //     sb.append("a");
        // }

        long end = System.currentTimeMillis();
        // System.out.println("Time for StringBuilder/ StringBuffer: " + (end - start)+"ms");
        System.out.println("Time for String: " + (end - start)+"ms");
        
    }
}
