/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollSystem;

/**
 *
 * @author Kelompok 4
 */
public class Education {

    String degree, major;
    int research;

    public Education(String degree, String major, int research) {
        this.degree = degree;
        this.major = major;
        this.research = research;
    }

    public Education() {
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getResearch() {
        return research;
    }

    public void setResearch(int research) {
        this.research = research;
    }
}
