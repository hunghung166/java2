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
public class Student {

    private String name;
    private String birthday;
    private String address;
    private String phone;
    private boolean gender;
    private String favourite;
    private String email;
    private String rollNumber;
    private String className;

    int status;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getFavourite() {
        return favourite;
    }

    public void setFavourite(String favourite) {
        this.favourite = favourite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", birthday=" + birthday + ", address=" + address + ", phone=" + phone + ", gender=" + gender + ", favourite=" + favourite + ", email=" + email + ", rollNumber=" + rollNumber + ", className=" + className + ", status=" + status + '}';
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Hung");
        student.setEmail("hungnvd00436@fpt.edu.vn");
        student.setAddress("222 Le Duan");
        student.setGender(true);
        student.setBirthday("16/06/1995");
        student.setClassName("C1702G");
        System.out.println(student.toString());

    }

}
