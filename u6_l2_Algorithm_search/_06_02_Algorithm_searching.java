package u6_l2_Algorithm_search;

import java.util.Scanner;

public class _06_02_Algorithm_searching
{
	public static void main(String[] args)
	{
		System.out.println("\n***** VIDEO 1: Traversing array + " + "searching for a value *****");

		/* VIDEO 1: Traversing array searching for a value */
		Scanner scan = new Scanner(System.in);

		double list[] = { 2.3, 4.7, 5.25, 9.5, 2.0, 1.2, 7.129, 5.4, 9.4 };

		System.out.println("What are you looking for? ");
		double look = scan.nextDouble();

		int where = -1;

		// search for value in the array, print -1 if not found
		for(int i = 0; i < list.length; i++)
		{
			if (list[i] == look)
			{
				where = i;
				break;
			}
		}

		if (where == -1)
		{
			System.out.println("Item " + look + ", not found");
		}
		else
		{
			System.out.println("Value is index: " + where);
		}

		System.out.println("\n***** VIDEO 2: Traversing array searching + " + "for a value *****");

		double list2[] = { 2.3, 4.7, 5.25, 9.5, 2.0, 1.2, 7.129, 1.2, 9.4 };

		System.out.println("What are you looking for? ");
		double look2 = scan.nextDouble();

		// counting instances of a value
		int count = 0;
		for(int i = 0; i < list2.length; i++)
		{
			if (list2[i] == look2)
			{
				count++;
			}
		}
		System.out.println(count + " instances of " + look2);

		System.out.println("\n***** Checking a condition - " + "All numbers are divisible by 3 *****");

		int[] list3 = { 81, 3, 3, 81, 12, 15 };
		boolean flag = true;

		for(int i = 0; i < list3.length; i++)
		{
			if (list3[i] % 3 != 0)
			{
				flag = false;
			}
		}

		if (flag)
		{
			System.out.println("All numbers are divisible by 3");
		}
		else
		{
			System.out.println("Not all numbers are divisible by 3");
		}

		System.out.println("\n***** Where should the bracket be? *****");
		double myList4[] = { 1.0, 2.1, 3.3 };

		// Don't show how to print yet.
		for(double d : myList4)
		{
			System.out.print(d + " ");
		}

		scan.close();
	}// End of main
}
