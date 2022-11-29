/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obyekti;

/**
 *
 * @author Umman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User.umumi = "Salam";

        User u = new User();
        User u2 = new User();

        u.name = "Umman";
        u2.name = "Huseyn";
        
        Test.deyish();

        System.out.println(u.name);
        System.out.println(u2.name);
        System.out.println(User.umumi);
    }

}
