package com.day06letsreview.app;
import java.util.Scanner;
/*
* HackerRank 30 Days of Code
* ========== Day 06 Let's Review ===========
* Given a string S, of length N that is indexed from 0 to N-1. prints its even-indexed and odd-indexed characters as
* 2 space-separated strings on a single line. Note 0 is considered to be an even index.
* Input Format
* - The first line contains an integer, T (the number of test cases).
* - Each line i of the T subsequent lines contains a String, S.
*/
public class LetsReview {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
        int iterations = 0;
        String line = "";
        String evenString="",oddString="";
        System.out.print("Input the number of iterations: ");
        iterations = scanner.nextInt();
        for(int i=0;i<iterations;i++){
            line = scanner.next();
            evenString="";oddString="";
            for(int j=0;j<line.length();j++){
                if(j%2==0){
                    evenString+=String.valueOf(line.charAt(j));
                }else{
                    oddString+=String.valueOf(line.charAt(j));
                } 
            }
            System.out.println(evenString+" "+oddString);
        }
	}
}
