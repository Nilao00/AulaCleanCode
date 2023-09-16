import java.util.HashMap;
import java.util.Map;

public class ValuesString {

    public int getValuesNumber(String value) {
        Map<String, String> valueReponseNumber = new HashMap<String, String>();

        valueReponseNumber.put("A", new String("1"));
        valueReponseNumber.put("2", new String("2"));
        valueReponseNumber.put("3", new String("3"));
        valueReponseNumber.put("4", new String("4"));
        valueReponseNumber.put("5", new String("5"));
        valueReponseNumber.put("6", new String("6"));
        valueReponseNumber.put("7", new String("7"));
        valueReponseNumber.put("8", new String("8"));
        valueReponseNumber.put("9", new String("9"));
        valueReponseNumber.put("10", new String("10"));
        valueReponseNumber.put("J", new String("11"));
        valueReponseNumber.put("Q", new String("12"));
        valueReponseNumber.put("K", new String("13"));

        if (valueReponseNumber.containsKey(value)) {
            return Integer.parseInt(valueReponseNumber.get(value));
        }

        return -1;
    }

}
