package methods2;

public class Students {
    private String firstName;
    private String lastName;

    public void greeting () {
        System.out.println("My fool name is: " + firstName + " " + lastName);
    }

    public String getFirsName() {
        return firstName;
    }

    public void setFirstName(String firsName) {
        this.firstName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
