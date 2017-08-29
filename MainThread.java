/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainthread;

/**
 *
 * @author nguyenhung
 */
public class MainThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer ctm = new Customer();
        ctm.setId("A001");
        ctm.setName("Hung Nguyen");
        ctm.setBirthday("16/06/1995");
        ctm.setEmail("hungnvd00436@fp.edu.vn");
        ctm.setBalance(500000);
        ctm.setAvatar("AAA");
        ctm.setStatus("dang xu ly");
        System.out.println(ctm.toString());
        ctm.sanPham();
        ctm.checkOut();
    }
}
