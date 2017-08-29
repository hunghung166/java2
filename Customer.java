/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainthread;

import java.util.Scanner;

/**
 *
 * @author nguyenhung
 */
public class Customer {

    private String id;
    private String name;
    private String email;
    private String birthday;
    private int balance;
    private String status;
    private String avatar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "Khach hang:" + "\nid=" + id + "\nname=" + name + "\nemail=" + email + "\nbirthday=" + birthday + "\nbalance=" + balance + "\nstatus=" + status + "\navatar=" + avatar;
    }

    public void sanPham() {
        Scanner sc = new Scanner(System.in);
        String productName;
        System.out.println("Nhap san pham : ");
        productName = sc.nextLine();
        System.out.println("Khach hang da chon san pham " + productName);
    }

    public void checkOut() {
        System.out.println("Khach hang thuc hien thanh toan hoa don");
    }

}
