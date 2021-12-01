package u6_L3;

import java.util.Scanner;

public class Arrays_of_strings
{
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("##### Inputting movie strings #####");
		String[] movies = new String[5];
		movies[0] = "Creatures from the black lagoon";
		movies[2] = "Star wars";

		for(int i = 0; i < movies.length; i++)
		{
			System.out.println(movies[i]);
		}


		System.out.println();
		System.out.println("##### Ask for user input #####");
		String[] inputMovies = new String[5];
		Scanner scan = new Scanner(System.in);

		// Ask for user input for movie titles
		for(int i = 0; i < movies.length; i++)
		{
			System.out.println("Please enter a movie title: ");
			inputMovies[i] = scan.nextLine();
		}


		System.out.println();
		System.out.println("##### printf the array #####");
		String[] moreMovies = { "Dracula", "Star Trek", "Nemo", "Justice league", "Wonder woman" };

		System.out.println("The movies\n");
		for(int i = 0; i < moreMovies.length; i++)
		{
			System.out.printf("%-15s%-2d%n", moreMovies[i], moreMovies[i].length());
		}


		System.out.println();
		System.out.println("##### First and last letters of each movie #####");
		String[] firstLast = { "Dracula", "Star Trek", "Nemo", "Justice league", "Wonder woman" };

		System.out.println("First and last letters of each movie\n");
		for(int i = 0; i < firstLast.length; i++)
		{
			String first_letter = firstLast[i].substring(0, 1);
			String last_letter = firstLast[i].substring(firstLast[i].length() - 1);
			System.out.printf("First letter: %-2s, last letter: %-2s%n", first_letter, last_letter);
		}


		scan.close();
	}// End of main
}
