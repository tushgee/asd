package lab42;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable {

    private int id;
    private String Lastname;
    private String Firstname;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private Employee supervisor;
    private Employee staff[];
    @Override
    protected Object clone() {
        Employee employee = new Employee();
        //implement deep copy here
        return employee;
    }
}
