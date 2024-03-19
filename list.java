import java.util.ArrayList;

public class list {
    public static void main (String[] args) {
        ArrayList<String> fruit = new ArrayList<>();

        fruit.add("apple");
        fruit.add("mango");
        fruit.add("banana");
        fruit.add("melon");
        fruit.add("water melon");

        System.out.println(fruit);
        String place = fruit.get(2);

        System.out.println(place);

        fruit.set(2, "green banana");

        System.out.println(fruit);

        fruit.remove(3);
        System.out.println(fruit);
        fruit.clear();
        System.out.println(fruit);
    }
}