/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import payrollSystem.Faculty.Level;


/**
 *
 * @author Kelompok 4
 */
public class TestDriver {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yy");
        Employee[] employee = new Employee[9];
        try {
            employee[0] = new Staff("Paita", "Allen", "123", 'M', sdf.parse("2/23/59"), 50.00);
            employee[1] = new Staff("Steven", "Zapata", "456", 'F', sdf.parse("7/12/64"), 35.00);
            employee[2] = new Staff("Enrique", "Rios", "789", 'M', sdf.parse("6/2/70"), 40.00);
            employee[3] = new Faculty("Anne", "Johnson", "243", 'F', sdf.parse("4/27/62"), Level.FU, new Education("Ph.D", "Engineering", 3));
            employee[4] = new Faculty("William", "Bouris", "791", 'F', sdf.parse("3/14/75"), Level.AO, new Education("Ph.D", "English", 1));
            employee[5] = new Faculty("Christopher", "Andrade", "623", 'F', sdf.parse("5/22/80"), Level.AS, new Education("MS", "Physical Education", 0));
            employee[6] = new Partime("Augusto", "Guzman", "455", 'F', sdf.parse("8/10/77"), 35.00, 30);
            employee[7] = new Partime("Martin", "Depirro", "678", 'F', sdf.parse("9/15/87"), 30.00, 15);
            employee[8] = new Partime("Marque", "Aldaco", "945", 'M', sdf.parse("11/24/88"), 20.00, 35);
            System.out.println("Details of all STAFF employees");
            for (Employee emp : employee) {
                if (emp.getClass() == Staff.class) {
                    System.out.println(emp.toString());
                    System.out.println("---");
                }
            }
            System.out.println();
            System.out.println("Details of all FACULTY employees");
            for (Employee emp : employee) {
                if (emp.getClass() == Faculty.class) {
                    System.out.println(emp.toString());
                    System.out.println("---");
                }
            }
            System.out.println();
            System.out.println("Details of all PART TIME employees");
            for (Employee emp : employee) {
                if (emp.getClass() == Partime.class) {
                    System.out.println(emp.toString());
                    System.out.println("---");
                }
            }
            float total_salary_all_employees = 0;
            float total_salary_partime_employees = 0;
            for (Employee emp : employee) {
                if (emp.getClass() == Partime.class) {
                    total_salary_partime_employees += emp.monthlyEarning();
                }
                total_salary_all_employees += emp.monthlyEarning();
            }
            System.out.println("Total monthly salary for all the part-time staff : " + total_salary_partime_employees);
            System.out.println("Total monthly salary for all employees: " + total_salary_all_employees);
        } catch (ParseException e) {
        }
    }
}
