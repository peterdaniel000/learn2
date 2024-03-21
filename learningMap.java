import java.util.Map;
import java.util.HashMap;

public class learningMap {
    public static void main(String[] args) {

        Map cars = new HashMap();

        cars.put("toyota", 1);
        cars.put("camry", 2);
        cars.put("bmw", 4);

        System.out.println(cars.get("toyota"));

    }
}
