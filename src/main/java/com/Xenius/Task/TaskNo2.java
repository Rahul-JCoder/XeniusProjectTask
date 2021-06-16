package com.Xenius.Task;
import java.util.Scanner;

public class TaskNo2 {

		public static void main(String[] args) {
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a number: ");
			int sum=0;
			int num =scan.nextInt();
			// TODO Auto-generated method stub
			scan.close();
			if(num<1)
				{System.out.println("Invalide number: exiting !!");
			return;}
			int an=1,ap=0,b=8,temp=0;
			System.out.print("\n Series is: ");
			for(int i=0;i<num;i++)
			{	if(i%2==0)
				{
					System.out.print(an+" ");
					temp=an;
					sum+=temp;
					an=an+ap;
					ap=temp;
				}
			else 
			{
				System.out.print(b+" ");
				sum+=b;
				b=temp+b;
			}
			}
			System.out.println("\n Sum: "+sum);
		}
}
