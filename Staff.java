/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollSystem;

import java.util.Date;

/**
 *
 * @author Kelompok 4
 */
public class Staff extends Employee {

    double hourlyRate;

    public Staff() {
    }

    public Staff(String firstName, String lastName, String idNumber, char sex, Date birthDate, double hourlyRate) {
        super(firstName, lastName, idNumber, sex, birthDate);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double monthlyEarning() {
        return hourlyRate * EmployeeInfo.STAFF_MONTHLY_HOURS_WORKED;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String toString() {
        String str = super.toString() + "\nMonthly Salary: " + monthlyEarning();
        return str;
    }
}
