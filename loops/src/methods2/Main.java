package methods2;

public class Main {
    public static void main(String[] args) {

        Students student1 = new Students();
        student1.setFirstName("Vovka");
        student1.setLastName("Morkovka");

        student1.greeting();

        System.out.println("One more time: " + student1.getFirsName() + " " + student1.getLastName());
    }
}
