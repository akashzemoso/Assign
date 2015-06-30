package ProjectEuler;
import java.util.Scanner;
import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.io.IOException;


public class MaxPAth {

	public static void main(String[] args) throws IOException
 {
		Scanner in = new Scanner(new File("p067_triangle.txt"));
		int a,b;
		int [][] x = new int [100][];
		for(a=0;a<100;a++){
			x[a] =new int [a+1];
		}
		for(a=0;a<100;a++)
		{
			for(b=0;b<=a;b++)
			{
				x[a][b]=in.nextInt();
			}}
		for (int i=99 ;i>0;i--)
		{
			for(int j=0;j<i;j++){
				int sum1,sum2;
				sum1= x[i][j]+x[i-1][j];
				sum2=x[i][j+1]+x[i-1][j];
				if(sum1>sum2){
					x[i-1][j]=sum1;}
				else
					x[i-1][j]=sum2;
			}}
		System.out.println(x[0][0]);}
			}

		

	


