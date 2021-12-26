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
public class Faculty extends Employee {

    Level level;
    Education education;

    public Faculty(String firstName, String lastName, String idNumber, char sex, Date birthDate, Level level, Education education) {
        super(firstName, lastName, idNumber, sex, birthDate);
        this.level = level;
        this.education = education;
    }

    public Faculty() {
    }

    @Override
    public double monthlyEarning() {
        if (level == Level.AS) {
            return EmployeeInfo.FACULTY_MONTHLY_SALARY;
        } else if (level == Level.AO) {
            return (1.5 * EmployeeInfo.FACULTY_MONTHLY_SALARY);
        } else if (level == Level.FU) {
            return (2 * EmployeeInfo.FACULTY_MONTHLY_SALARY);
        }
        return 0;
    }

    enum Level {
        AS,
        AO,
        FU
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public String toString() {
        String role = "";
        if (level == Level.AS) {
            role = "Assistant Professor";
        } else if (level == Level.AO) {
            role = "Associate Professor";
        } else if (level == Level.FU) {
            role = "Full Professor";
        }
        String str = super.toString() + "\n" + role + "\nMonthly Salary: " + monthlyEarning();
        return str;
    }
}
