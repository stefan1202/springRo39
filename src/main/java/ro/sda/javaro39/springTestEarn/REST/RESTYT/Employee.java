package ro.sda.javaro39.springTestEarn.REST.RESTYT;

//import javax.persistence.*;
//
//@Entity
//@Table(name = "angajatiTable")
public class Employee {
//    @Id
//    @SequenceGenerator(name = "employee_sequence", allocationSize = 1)
//    @GeneratedValue(generator = "employee_sequence", strategy = GenerationType.SEQUENCE)
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String emailAddress;
    private String address;
    private String role;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int age, String emailAddress, String address, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.emailAddress = emailAddress;
        this.address = address;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age + ", emailAddress='" + emailAddress + '\'' + ", address='" + address + '\'' + ", role='" + role + '\'' + '}';
    }
}
