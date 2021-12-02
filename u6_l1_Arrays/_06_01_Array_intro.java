package u6_l1_Arrays;

public class _06_01_Array_intro
{

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		/* How to declare an array */
		int[] list = new int[7];
		System.out.println(list[0]);
		System.out.println(list[1]);
		System.out.println(list[2]);
		System.out.println(list[3]);
		System.out.println(list[4]);
		System.out.println(list[5]);
		System.out.println(list[6]);

		/* Video number 2 and 3 */
		int[] numbers = { 14, -10, 1, 0, 9, -7, 3 };
		//Increase 9 to 10
		System.out.println(numbers[4]);
		numbers[4]++;
		System.out.println(numbers[4]);

		//reassign a value of the array
		System.out.println(numbers[0]);
		numbers[0] = numbers[1] + 2;
		System.out.println(numbers[0]);

		//use a value in an operation
		System.out.println(numbers[6]);
		numbers[6] *= 4;
		System.out.println(numbers[6]);

		/* Video 3 */
		//declare null array
		int[] arr1;

		//declare array with empty spaces defaulted to 0
		int[] arr2 = new int[5];

		//declare array with initial values
		int[] arr3 = { 1, 2, 3, 4 };

		//printing a null array item
		//		System.out.println(arr1[0]);
		System.out.println(arr2[0]);

		//initializing a double array
		double[] doubleArr1 = new double[3];
		System.out.println(doubleArr1[0]);

		//initializing a boolean array
		boolean[] boolean_array = new boolean[3];
		System.out.println(boolean_array[0]);

		//initializing a String array
		String[] string_array = new String[3];
		System.out.println(string_array[0]);

		//from array with values
		System.out.println(arr3[0]);

		/* Student activity */
		int[] my_array1;
		my_array1 = new int[10];
		my_array1[0] = 0;
		my_array1[1] = 1;
		my_array1[2] = 3;
		my_array1[3] = 4;
		my_array1[4] = 5;
		my_array1[5] = 6;
		my_array1[7] = 7;
		my_array1[8] = 8;
		my_array1[9] = 9;

		int[] my_array2 = new int[10];

		int[] my_array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(my_array[0]);
		System.out.println(my_array[5]);
		System.out.println(my_array[9]);

	}

}
