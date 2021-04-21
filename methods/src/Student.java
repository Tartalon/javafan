public class Student {
    private String firstName;
    private String lastName;

    public void printFullName () {
        System.out.println("Your full name is " + firstName + " " + lastName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
