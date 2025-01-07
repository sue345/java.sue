/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu25.nextaiinc;

/**
 *
 * @author CORE i7
 */
 import java.util.Scanner;

public class NextAiInc {
    public static void calculatePay(int basePay,int hoursWorked){
        
        final int MIN_BASE_PAY=30000;
        
        final int MAX_REGULAR_HOURS=48;
        
        final int MAX_TOTAL_HOURS=72;
        
        final int OVERTIME_MULTIPLIER=2;
        
        if(basePay<MIN_BASE_PAY)
        {
            System.out.println("Error:Base pay is below the minimum required rate.");
            
            return;
        }
        if(hoursWorked>MAX_TOTAL_HOURS){
                System.out.println("Error:Hours worked exceed the maximum limit of 72 hours.");
            
            return;
            
        }
        int regularHours=Math.min(hoursWorked,MAX_REGULAR_HOURS);
        int overtimeHours=Math.max(0,hoursWorked-MAX_REGULAR_HOURS);
        
        int regularPay=regularHours*basePay;
        
        int overtimePay=overtimeHours*basePay*OVERTIME_MULTIPLIER;
        
        
        int totalPay=regularPay + overtimePay;
        
        System.out.println("Total weekly pay:UGX"+ totalPay);
    }    

    public static void main(String[]args){
        
        System.out.println("Contractor A:");
        calculatePay(30000,51);
        
        System.out.println("Contractor B:");
        calculatePay(20000,40);
        
        System.out.println("Contractor C:");
        calculatePay(35000,96);
        
        
        
      }
        
    }

