/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan30.cakep;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 * 
 */
public class IF0110118025Latihan30Cakep {

    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    
    public static void main(String[] args) {
        // TODO code application logic here
        String konfirmasi, kondisi;
        Scanner scan = new Scanner(System.in);
        
        System.out.println(RED + "Kamu " + GREEN + "ngerjain sendiri " + YELLOW + "latihan 17 sampe " + BLUE + "latihan30 ini? ");
        System.out.println(BLUE + "Jawab" + RED + "(Yoi/Engga)");
        konfirmasi = scan.nextLine();
        kondisi = konfirmasi.toUpperCase();
        
        if(kondisi.equals("YOI")){
            System.out.println(RED + "\nCakep bener. " + PURPLE + "Good Job");
        }else{
            System.out.println("\nTetep Cakep SIh." + RED);
            System.out.println(CYAN + "SIng penting paham konsepnya ye");
            System.out.println("Keep teh code work dude");
        }
    }
    
}
