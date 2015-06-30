package assignments;

import assignment.ZDigit;
import assignment.ZNumber;

public class ZMain {

	public static void main(String[] args) 
	 {//Assighnment 1
		ZDigit A =new ZDigit ('A');
		ZDigit B =new ZDigit ('B');
		ZDigit C =new ZDigit ('C');
		ZDigit D =new ZDigit ('D');
		
		
		//Assighnment 2
		ZNumber zn1 = new ZNumber(A,B,C,D);
		System.out.println(zn1);
		//Assighnment 3
		zn1.toDecimal();
	ZNumber s = new ZNumber('A','B','C','D','E');	
	ZNumber zn = new ZNumber("ABCD");
	ZNumber zn2 = new ZNumber("ABCDE");
	ZNumber zn4 = new ZNumber(new char[]{'A','B'});
	ZDigit[] z=zn2.getDigits();
	//System.out.println(z[5].c);
	
	 }
}

