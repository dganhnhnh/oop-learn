import java.lang.reflect.Field;

public class Printable {
    public String printProperties() {
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
            s += fieldName + ": " + fieldValue+"; ";
        }
        return s;
    }
}

