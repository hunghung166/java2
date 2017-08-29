/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconsole.enity;

/**
 *
 * @author nguyenhung
 */
public class Employee {

    private String name;
    private String birthday;
    private boolean gender;
    private String phone;
    private String email;
    private String employeeNumber;
    private String company;

    public Employee() {
    }

    public Employee(String name, String birthday, boolean gender, String phone, String email, String employeeNumber, String company) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.employeeNumber = employeeNumber;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" + "\n name=" + name + ",\n birthday=" + birthday + ",\n gender=" + gender + ",\n phone=" + phone + ",\n email=" + email + ",\n employeeNumber=" + employeeNumber + ", company=" + company + '}';
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Hung");
        emp.setGender(true);
        emp.setBirthday("16/06/1995");
        emp.setEmail("hungnvd00436@fpt.edu.vn");
        emp.setPhone("01635233442");
        emp.setCompany("FPT Aptech");
        emp.setEmployeeNumber("1");
        System.out.println(emp.toString());
    }

}
