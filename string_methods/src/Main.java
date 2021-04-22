import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String name = "Bro  ";

        boolean res1 = name.equals("Bro");
        boolean res2 = name.equals("bro");
        boolean res3 = name.equalsIgnoreCase("bro");

        int resLength = name.length();
        char resChar = name.charAt(1);

        int resIndex = name.indexOf("B");

        boolean resEmpty = name.isEmpty();

        String resUpper = name.toUpperCase();
        String resLower = name.toLowerCase();
        String resTrim = name.trim();
        String resReplace = name.replace('o', 'a');

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

        System.out.println(resLength);
        System.out.println(resChar);

        System.out.println(resIndex);

        System.out.println(resEmpty);

        System.out.println(resReplace);

    }
}
