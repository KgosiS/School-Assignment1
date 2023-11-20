/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kgosi.progass.k.sebako_st10312616;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sebak
 */
public class Student {
    //Declared my variables that are reqired for the program
   public  ArrayList<String>studentNames=new ArrayList<>();
   public ArrayList<String> studentEmails=new ArrayList<>();
   public ArrayList<String>studentCourses=new ArrayList<>();
   private final ArrayList<Integer>studentIDs=new ArrayList<>();
   private final ArrayList<Integer>  studentAge=new ArrayList<>();
   public int numStudent;
    
  
     
   
   public void SaveStudent(){
    //created method to save students
     int numOfStudents;
    Scanner sebako=new Scanner(System.in);
    System.out.println("Please enter amount of student you would like to save:");
    numOfStudents=sebako.nextInt();
    numStudent=numOfStudents;
    for(int k= 0; k < numOfStudents;k++){
        //i created a loop for each element that would be required to complete 1 student's info
      System.out.println("Please enter student number:");
      studentIDs.add(k, sebako.nextInt());
      System.out.println("Please enter student name:");
      studentNames.add(k, sebako.next());
      
      try{
          //created a try catch block for if the user inputs wrong element
          System.out.println("Please enter student age:");
          studentAge.add(k, sebako.nextInt());
           sebako.nextLine();
       if(studentAge.get(k)>=16 ){
         System.out.println("Student age captured!");
     }else{System.out.println("Student is too young.");
           System.out.println("Please enter student's correct age:>>");
           studentAge.add(k, sebako.nextInt());
           System.out.println("Student age captured!");
           sebako.nextLine(); }
        }
      catch(InputMismatchException e){
        int temp;
          System.out.println("YOU HAVE ENTERED WRONG AGE!!!");
          sebako.nextLine();
           System.out.println("Please enter correct student age:");
          temp=sebako.nextInt();
          if(temp>=16 ){
         System.out.println("Student age captured!");
     }else{System.out.println("Student is too young.");
           System.out.println("Please enter student's correct age:>>");
           studentAge.add(k, sebako.nextInt());
           System.out.println("Student age captured!");
           sebako.nextLine(); }
        
          studentAge.add(k, temp);
      }
      System.out.println("Please enter student email:");
      studentEmails.add(k, sebako.next());
      System.out.println("Please enter student course:");
      studentCourses.add(k, sebako.next());
          } boolean prog_run=true;
   while(prog_run){
       //created a menu inside the save student method for the program to be able to access the variables stored to the arraylists
    System.out.println("""
                       PLEASE ENTER WHAT YOU WOULD LIKE TO DO:
                       1.Delete student report.
                       2.Search For a student.
                       3.Print Student report.
                       4.Back to Main Menu.""");
                       int selectNum= sebako.nextInt();  

    switch (selectNum) {
        //below are the codes that are going to excute for the user called from the Student class 
        
        case 1:        //option one is to delete a student the code for it is below
                 int  numToDelete;
                    System.out.println("Enter the Student Id to delete:  ");
                    numToDelete=sebako.nextInt();
                    sebako.nextLine(); 
                    for (int v =0; v < numStudent;v++){
                    if(studentIDs.get(v)==numToDelete){
                     System.out.println("Are you sure you want to student "+numToDelete+"  from the system ? \nYES(y) to delete.");
                     String agreeLetter = sebako.next();
                     if(agreeLetter.equalsIgnoreCase("y")){
                     System.out.println("Student with Student Id: "+numToDelete+" WAS deleted!");  
                       studentIDs.remove(v);
                       studentNames.remove(v);
                       studentEmails.remove(v);
                       studentCourses.remove(v);
                       studentAge.remove(v); 
                      break;   }
                  
                        
                       }else if (studentIDs.get(v)!=numToDelete){
                        System.out.println("STUDENT NOT FOUND!");
                    }
        
    }
                     
            break;
          
             case 2:
                 //option two is to search for a student code for it is below
              int searchNum;
            System.out.println("PLEASE ENTER STUDENT NUMBER TO SEARCH:");
              searchNum=sebako.nextInt();
              sebako.nextLine();  
              boolean found = false;
               for (int i = 0; i < studentIDs.size(); i++){
                   //created a loop to search for eaxh element if it matches what the user is looking for
               if(studentIDs.get(i)==searchNum ) {
        System.out.println("STUDENT ID:"+studentIDs.get(i));
        System.out.println("STUDENT NAME:"+studentNames.get(i));
        System.out.println("STUDENT NAME"+studentAge.get(i));
        System.out.println("STUDENT EMAIL:"+studentEmails.get(i));
        System.out.println("STUDENT COURSE:"+studentCourses.get(i));
    
                break;}if (studentIDs.get(i)!=searchNum) {
            System.out.println("Student not found.");
        }
               
               } break;
        case 3:
            //option three is to print out the student
            for(int d=0;d<studentIDs.size();d++){       
        System.out.println("""
                           -----------------------------------------------------
                             STUDENT     """+d+"\n-----------------------------------------------------");
        System.out.println("STUDENT ID:"+studentIDs.get(d));
        System.out.println("STUDENT NAME:"+studentNames.get(d));
        System.out.println("STUDENT AGE:"+studentAge.get(d));
        System.out.println("STUDENT EMAIL:"+studentEmails.get(d));
        System.out.println("STUDENT COURSE:"+studentCourses.get(d));  
        if(studentIDs.isEmpty()){
            System.out.println("STUDENT REPORT EMPTY");
        }
                 }
       
               break;
           
            
        
     
    
        case 4:
            prog_run=false;
        default:System.out.println("Welcome back to the Main Program!");
        break;
    
    }
   
  
   }}}




