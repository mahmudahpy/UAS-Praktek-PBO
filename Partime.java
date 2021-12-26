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
public class Partime extends Staff {

    int hoursWorkedPerWeek;

    public Partime(String firstName, String lastName, String idNumber, char sex, Date birthDate, double hourlyRate, int hoursWorkedPerWeek) {
        super(firstName, lastName, idNumber, sex, birthDate, hourlyRate);
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    public Partime() {
    }

    @Override
    public double monthlyEarning() {
        return hourlyRate * hoursWorkedPerWeek * 4;
    }

    public int getHoursWorkedPerWeek() {
        return hoursWorkedPerWeek;
    }

    public void setHoursWorkedPerWeek(int hoursWorkedPerWeek) {
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    public String toString() {
        return super.toString() + "\nHours worked per month: " + (hoursWorkedPerWeek * 4);
    }

}
