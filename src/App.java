
public class App {

    public static void main(String[] args) {
    }

    public int converteCartaParaInt(String caracterer) {
        ValuesString values = new ValuesString();

        return values.getValuesNumber(caracterer.toUpperCase());
    }

}
