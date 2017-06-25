package assignments;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		int i,j;
		for( i = 1; i <= 4; i++) //for 4 loops
		{
		for(j = 1; j <= 5-i; j++) //for spaces
		System.out.print(" ");
		for(j = 1; j <= 2*i-1; j++)
		if(j <= i)
		System.out.print((char)(char)(j+96)+""); //for printing values
		else
		System.out.print((char)(char)(2*i-j+96)+"");
		System.out.println(); //for line break
		}
		}
		
		

}

