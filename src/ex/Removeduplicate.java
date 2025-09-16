package ex;

import java.util.Scanner;

public class Removeduplicate {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String name=sc.nextLine();
		String result="";
		
		for(char ch:name.toCharArray()) {
			if(result.indexOf(ch)==-1) {
				result=result+ch;
			}
		}
		System.out.println("After removing duplicate: "+result);
		sc.close();
	}

}
