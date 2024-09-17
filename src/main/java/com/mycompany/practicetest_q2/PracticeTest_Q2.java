/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicetest_q2;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;

public class PracticeTest_Q2 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the current estate agent name: ");
        String name = input.nextLine();
        
        System.out.print("Enter the property price: ");
        double price = input.nextDouble();
        
        EstateAgentSales eas = new EstateAgentSales(name, price) {};
        eas.printPropertyReport();
    }
}
