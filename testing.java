import java.util.ArrayList;

public class testing {
    public static void main(String[] args) {
        ArrayList<String> number = new ArrayList<>();

        number.add("food");
        number.add("dance");
        number.add("gaming");

        System.out.println(number);

         number.set(1, "cooking");
         System.out.println(number);

         number.remove(2);
         System.out.println(number);

         number.clear();
         System.out.println(number);
    }
}
