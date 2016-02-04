package com.vikas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//WAP that creates an object every time user chooses so and prints total number of objects 
//created by that time..

public class Exer3 {
	
	static int count;
	Exer3(){count++;}
	
	public static void main(String... args) throws IOException{
		char ch;		
		do{
			new Exer3();
			System.out.println("Number of objects created so far.. : "+count);
			System.out.println("Do you want to create another object");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ch=(char)br.read();
		}while(ch=='y');
		
		
	}

}
