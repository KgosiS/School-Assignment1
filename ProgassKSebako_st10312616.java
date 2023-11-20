/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package kgosi.progass.k.sebako_st10312616;

import java.util.Scanner;

/**
 *
 * @author sebak
 */
public class ProgassKSebako_st10312616 {

    public static void main(String[] args) {
       boolean prog_run=true; 
       Scanner kgosi= new Scanner(System.in);
       //Imported the scanner so tha the user is able  to input their option which they want to accesss
        while(prog_run)
        //added a while loop for the program/application to run till the user decides to exit
        {
            //the menu structure that is suppose to display for the user on the console 
        System.out.println("STUDENT MANAGEMENT APPLICATION:");
        System.out.println("********************************************************");
        System.out.println("ENTER (1) TO LAUNCH MENU OR PRESS  KEY (2) TO EXIT");
        int selectNum= kgosi.nextInt();  
    switch (selectNum) {
        //below are the codes that are going to excute for the user called from the Student class 
        
        case 1:
            {  System.out.println("(YOU ARE ABOUT TO CAPTURE STUDENT DETAILS)");
               Student obj = new Student();
               obj.SaveStudent();
                break;
            }
        case 2:
        prog_run=false; 
        default:System.out.println("THANK YOU FOR USING OUR PROGRAM!");
            break;
    }
        
        }
}}

