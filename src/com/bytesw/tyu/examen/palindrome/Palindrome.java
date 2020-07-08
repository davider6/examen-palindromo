package com.bytesw.tyu.examen.palindrome;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner( System.in );
		
		System.out.print("Ingrese su nombre: ");
		
		String palabra = scan.next();
		
		char[] newEval = new char[ palabra.length() ];
		
		for (int i = 0; i < palabra.length(); i++) {
			

			
			newEval[ i ] = palabra.charAt( palabra.length() - (i +1));
		}
		
		
		System.out.println( "La palabra '"+palabra+"' "+ (( palabra.equalsIgnoreCase( new String( newEval ) ) )? "SI" : "NO")  +" es palindrome" );
		
		
	}

}
