package org.murugappan;

import org.murugappan.service.*;


import java.util.Scanner;


public class App
{
    public static void main(String[] args) {
    UserDetailsService ucs= new UserDetailsService();
    Scanner ip=new Scanner(System.in);
        System.out.println("1.Register As New User\n2.Login As Existing User");
        int roleFlag = ip.nextInt();
        if (roleFlag == 1) {
            ucs.createUser();
        } else if (roleFlag == 2) {
            ucs.fetchRole();
        } else {
            System.out.println("Enter A Valid Option");
        }
        
        
    }
}
