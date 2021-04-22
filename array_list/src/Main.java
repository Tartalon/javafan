import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList = a resizable array.

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi");  // replace(index, new value).
        food.remove(2);  // remove element.
        food.clear();

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(24);
        numbers.add(68);
        numbers.add(2);

        System.out.println(numbers);
    }
}
