package com.practice;

import java.util.Scanner;


public class Game 
{
		public static void main(String[] args) 
		{
		
			wordle();
			
		}

		private static void wordle()
		{
			
			System.err.println("-------------------------welcome to wordle game------------------------------");
			System.err.println("Rules:\n 1. the word correct indicates that  y"
					+ "ou find the correct position of letter in the word \n 2. "
					+ "the word present indicates that  you have the letter in the word "
					+ "\n 1. the word wrong indicates that  you donot have  letter in the word");
			String wish="";
			int levelnum=1;
			do 
			{
				System.out.println("                         "+"Level "+levelnum+"                     ");
				System.out.println("                       ------------                 ");
				System.out.println();
			String[] words= {"task","hunt","road","fear","film","read","play","bank","toys","save"};
			int randnum=(int) (Math.random()*10);
			String Developer=words[randnum];
			System.out.println(Developer);
			int count=0;
			do 
			{
				count=0;
				String word=getinput();
				System.out.println("------------------------------------------------------------");
				System.out.println("given words is "+word);
				char[] word1=tomakethewordincharacterarray(word);
			
				System.out.println();
			
				count =findingposition(word,Developer);
				
				System.out.println();

			System.out.println("you have find "+count+" letter position ");
			}while(count!=4);
			System.out.println();
	
			//System.out.println("you have find the all  "+count+" position");
			System.out.println("you  have successfully find the word");
			if (levelnum==5) 
			{
				System.out.println("your are successfully completed the game");
				System.out.println("Thank you");
				System.exit(0);
			}
			System.out.println("if you want to continue the  next level of this  game press Y or N");
			levelnum++;
			Scanner scan = new Scanner(System.in);
			wish=scan.next();
			}while(wish.equals("Y"));
				

			
			
			
			}
			
	

		private static int findingposition(String word, String Developer) 
		{
			int count=0;
			for(int i=0;i<word.length();i++) 
			{
					if (word.charAt(i)==(Developer.charAt(i)))
					{	
						System.out.print("Correct"+" ");
						count++;
					}
					else 
					{ 	
					char d=word.charAt(i);
					String fd=String.valueOf(d);
						if (Developer.contains(fd)) 
						{
							System.out.print("present"+" ");	
						}
						else 
						{
							System.out.print("Wrong"+" ");	
						}
					}
			}
			return count;
		}

		private static String getinput() 
		{
			String word="";
			do
			{
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the four letter word");
			word =scan.next();	
			}while(word.length() !=4);
			return word;
		}
		
		private static char[] tomakethewordincharacterarray(String word)
		{
			char [] word1 = word.toCharArray();
			for(int i=0;i<word1.length;i++) 
			{
				System.out.print(word.charAt(i)+"       ");
			}
			return word1;
			
		}
}

