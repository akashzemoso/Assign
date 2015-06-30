//package ProjectEuler2;
import java.util.Scanner;
import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;
//import java.util.regex.*;
import java.io.IOException;
import java.util.Arrays;
public class Xor {

	public static void main(String[] args) throws IOException {

		int i=0,temp=0,counts=1,j;
		Scanner s = new Scanner(new File("p059_cipher.txt")).useDelimiter("\\s*,\\s*");
		int[] a= new int [10];
		while(s.hasNextInt())
		{
			if(a.length==i){
				a= Arrays.copyOf(a, a.length+10);
					}
			a[i]=s.nextInt();
			i++;
		}
		/*for( j=0;j<i;j++)

			System.out.println(a[j]);*/

		int [][] c= new int [17576][1200];
		int flag=0;
		for ( j=97;j<=122;j++){
			for (int k=97;k<=122;k++){
				for (int l=97;l<=122;l++)
					{flag=1;

					for(i=0;i<1200 && flag==1;i++){ //int d;
						if (i%3==0){
						c[temp][i]=a[i]^j;
							if(!((c[temp][i]>=65 && c[temp][i]<=90) || (c[temp][i]>=97 && c[temp][i]<=122) ||(c[temp][i]>=48&&c[temp][i]<=57)|| c[temp][i]==59 || c[temp][i]==32||c[temp][i]==33||c[temp][i]==39 || c[temp][i]==40||c[temp][i]==41|c[temp][i]==44||c[temp][i]==46)) flag=-1;}
					if (i%3==1){
						c[temp][i]=a[i]^k;
	if(!((c[temp][i]>=65 && c[temp][i]<=90) || (c[temp][i]>=97 && c[temp][i]<=122) ||(c[temp][i]>=48&&c[temp][i]<=57)|| c[temp][i]==59 || c[temp][i]==32||c[temp][i]==33||c[temp][i]==39 || c[temp][i]==40||c[temp][i]==41|c[temp][i]==44||c[temp][i]==46)) flag=-2;}
						if (i%3==2){
						c[temp][i]=a[i]^l;
if(!((c[temp][i]>=65 && c[temp][i]<=90) || (c[temp][i]>=97 && c[temp][i]<=122) ||(c[temp][i]>=48&&c[temp][i]<=57)|| c[temp][i]==59 || c[temp][i]==32||c[temp][i]==33||c[temp][i]==39 || c[temp][i]==40||c[temp][i]==41|c[temp][i]==44||c[temp][i]==46)) flag=-3;}

						}if (flag==1)temp++;	
						else if(flag==-2||flag==-1)
							break;}


					if(flag==-1)break;}

				//if(counts!=1)break;

			}
		
		System.out.println(temp);

		for(int x=0;x<temp;x++)
		  {
		  for(int y=0;y<1200;y++)
		  {System.out.print((char)c[x][y]);}
	System.out.println("");}
	}
}




