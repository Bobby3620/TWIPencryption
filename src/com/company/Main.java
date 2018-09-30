package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Global vars
        Scanner kbInput = new Scanner(System.in);
        Random ranNum = new Random();

        //Where the user inputs a string
        System.out.println("Type a string");
        String kbWord = kbInput.nextLine();
        int wordLen = kbWord.length();

        //Random number
        int sp = (int)(wordLen * 0.10 + 1);

        //To binary, octal, decimal, hex, ASCII
        String a = Integer.toBinaryString(wordLen);//1
        String b = Integer.toOctalString(wordLen);//2
        int c = Integer.parseInt(a, 10);
        String d = Integer.toHexString(wordLen);//4
        char e = kbWord.charAt(4);
        int ee = (int)e;//5

        //Decides if it's binary, octal, decimal, hex, ASCII
        for(int i = sp; i <= 5; i++){
            if(i == 1){
                System.out.print("The encryption of" + " " + kbWord + " is " + a);
            }
            else if(i == 2){
                System.out.print(b);
            }
            else if(i == 3){
                System.out.print(c);
            }
            else if(i == 4){
                System.out.print(d);
            }
            else if(i == 5){
                System.out.print(ee);
            }
        }

    }
}
