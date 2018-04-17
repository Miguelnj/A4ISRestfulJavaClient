/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplerestclientapp;

import binary.binaryClient;
import java.util.Scanner;

public class SimpleRestClientApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("PROBANDO SERVICIO FACTORIAL");
        System.out.println(hello("User"));
        System.out.println("Write a number to calculate its factorial.");
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        System.out.println("Factorial de " + n + " es: " + factorial(n));

        
        System.out.println("PROBANDO SERVICIO WEBAPPLICATION");
        binaryClient bc = new binaryClient();
        System.out.println("Write a number to calculate the binary form of it.");
        String nToBinary  = scanner.next();
        try{
            System.out.println("Binary form of "+ nToBinary + " is: " +bc.getJson(String.class, nToBinary));
        }catch(Exception e){
            System.out.println("Oops! Looks like something went wrong");
            System.out.println("Are you sure u entered an integer?");
        }
        
    }  

    private static int factorial(int n) {
        fact.Factorial_Service service = new fact.Factorial_Service();
        fact.Factorial port = service.getFactorialPort();
        return port.factorial(n);
    }

    private static String hello(java.lang.String name) {
        fact.Factorial_Service service = new fact.Factorial_Service();
        fact.Factorial port = service.getFactorialPort();
        return port.hello(name);
    }
}
