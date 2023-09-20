package studio3;

import java.util.Scanner;

public class Seive2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers?");
		
		int numbers = in.nextInt();
		
		int[] array = new int[numbers];
		
		for (int a = 0; a < array.length; a++)
		{

				array[a] = a;
		}
		
		
		for (int i = 2; i < array.length; i++)
		{
			if (i != 0)
			{
				for (int j = i*i; j < array.length; j = j + i)
				{
					array[j] = 0;
				}
			}
			
				
			
		}
		for (int i = 2; i < array.length; i++)
		{
			if (array[i] != 0)
			{
			System.out.println(array[i]);
			}
		}
	}

}
