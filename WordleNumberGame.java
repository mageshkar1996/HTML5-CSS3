package com.practice;

import java.util.Random;
import java.util.Scanner;

public class WordleNumberGame 
{
	
	public static void main(String[] args)
	{	
		System.err.println("-------------------------welcome to wordle game------------------------------");
		System.err.println("Rules:\n 1. the word correct indicates that  y"
				+ "ou find the correct position of digit in the number \n 2. "
				+ "the word present indicates that  you have that digit  in the number "
				+ "\n 3. the word wrong indicates that  you donot have  digit in the number"+
				"\n 4. you need to find the unique number");
		System.err.println("----------------------------------------------------------------------------------");
		String wish="";
		int levelnum=1;
		do {
			
		int count=0;
		int [] inter= {1582,1586,1852,9632,1584,1526,5286,1586,1234,1572};
		int randnum=(int) (Math.random()*10);
		System.out.println("                         "+"Level "+levelnum+"                     ");
		System.out.println("                       ------------                 ");
		System.out.println();

		do
		{
		count=0;
		int input=wordle();
		int Developer=inter[randnum];
		System.out.println(Developer);
		int counting=countofnumber(input);
		int [] arrayform=tomakeasarrayform(input,counting);
		for(int i=arrayform.length-1;i>=0;i--) 
		{
			System.out.print(arrayform[i]+"           ");
		}
		System.out.println();
		String userinput=String.valueOf(input);
		String developerinput=String.valueOf(Developer);
		for(int i=0;i<userinput.length();i++) 
		{
			if (userinput.charAt(i)==developerinput.charAt(i))
			{
			System.out.print("correct     ");
			count++;
			}
			else
			{
				String word=String.valueOf(userinput.charAt(i));
				if (developerinput.contains(word))
				{
					System.out.print("present     ");
				}
				else
				{
					System.out.print("wrong     ");	
				}
			}
		}
		System.out.println();
		System.out.println("your are  find "+count+" number");
		System.out.println("--------------------------------------------------------------------------");
	}while(count !=4);
		levelnum++;
	System.out.println("your are successfully find the number");
	if (levelnum==5) 
	{
		System.out.println("your are successfully completed the game");
		System.out.println("Thank you");
		System.exit(0);
	}
	System.out.println("your completed this level");
	System.out.println("if you want to continue the  next level of this  game press Y or N");
	
	Scanner scan = new Scanner(System.in);
	wish=scan.next();
	}while(wish.equals("Y"));
		
		
	
	}

	
	

	private static int[] tomakeasarrayform(int input,int num) 
	{
		int initial = input;
		int [] a= new int[num];
		int i=0;
		while(initial>0) 
		{
			int rem=initial%10;
			a[i]=rem;
			i++;
			initial=initial/10;
		}
		
		return a;
	}

	public static int wordle() 
	{
		int count=0;
		int num=0;
		do 
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Four Digit Number");
		try 
		{
			count=0;
			num=scan.nextInt();
			Integer.valueOf(num);
			count=countofnumber(num);
			
		}
		catch(Exception obj) 
		{
			System.out.println("please enter the number");
		}
		}while(count!=4);
		
		System.out.println("your Number is "+num);
		return num;
	}
	
	public static int countofnumber(int num) 
	{
		int checknum=num;
		int count=0;
		while(checknum>0) 
		{
		count++;
		checknum=checknum/10;
		}
		return count;
	}
	
	
	
	
}

