public class Student {
    private int age;
    private String firstName;
    private String lastName;
    private int year;
    private Address address;

    public Student(String firstName, String lastName, int age, int year, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.year = year;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private void addOneAge() {
        age++;
    }

    public int birthday() {
        addOneAge();
        return age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", age " + age + ", year " + year + ", " + address.toString();
    }
}