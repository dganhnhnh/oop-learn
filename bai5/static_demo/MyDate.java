package static_demo;
public class MyDate {
    public static long getMillisSinceLastEpoch() {
        return System.currentTimeMillis();
    }
    long millis = MyDate.getMillisSinceLastEpoch();
}
