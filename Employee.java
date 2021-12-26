/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollSystem;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Kelompok 4
 */
public abstract class Employee {

    String firstName, lastName, idNumber;
    char sex;
    Date birthDate;

    Employee() {
    }

    Employee(String firstName, String lastName, String idNumber, char sex, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public String toString() {
        SimpleDateFormat dateformat = new SimpleDateFormat("mm/dd/yy");
        String str = "ID Employee number: " + idNumber + "\nEmployee Last name: "
                + lastName + ", Firstname: " + firstName + "\nBirth Date: "
                + dateformat.format(birthDate);
        return str;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstame(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getIdnumber() {
        return idNumber;
    }

    public void setIdnumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthDate;
    }

    public void setBirthdate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public abstract double monthlyEarning();
}
