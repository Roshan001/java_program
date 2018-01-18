import java.util.Scanner;

public class Array_operation {

	public static void main(String[] args) {
		int[] array = new int[10];
		array[0] = 1;
		array[1] = 3;
		array[2] = 5;
		array[3] = 2;
		array[4] = 4;
		array[5] = 7;
		array[6] = 8;

		String[] str_arry = new String[10];
		str_arry[0] = "aa";
		str_arry[1] = "bb";
		str_arry[2] = "cc";
		str_arry[3] = "dd";
		str_arry[4] = "ee";
		str_arry[5] = "ff";
		str_arry[6] = "gg";
		str_arry[7] = "hh";
		str_arry[8] = "ii";
		str_arry[9] = "jj";

		System.out.println("1.Array Insert\n2.Array sort\n3.Array remove\n4.String array remove\n");
		System.out.println("Enter your Choice");
		Scanner read = new Scanner(System.in);
		int choice = read.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter element to insert");
			Scanner read1 = new Scanner(System.in);
			int element = read1.nextInt();

			System.out.println("Please enter the insert position");
			int position = read1.nextInt();

			if (position > array.length) {
				System.out.println("Please enter position between 1 to " + array.length);
			} else {
				System.out.println("Array before inserting element");
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + " ");
				}
				int temp[] = new int[array.length];

				temp[0] = element;
				for (int i = position - 1, j = 1; i < array.length; i++, j++) {
					temp[j] = array[i];
				}

				for (int i = position - 1, j = 0; i < array.length; i++, j++) {
					array[i] = temp[j];
				}
				System.out.println("\nArray after inserting element");
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + " ");
				}

			}

			break;
		case 2:
			System.out.println("\nBefore Sorting");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = i + 1; j < array.length; j++) {
					int tmp = 0;
					if (array[i] > array[j]) {
						tmp = array[i];
						array[i] = array[j];
						array[j] = tmp;
					}
				}
			}

			System.out.println("\nAfter Sorting");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			break;
		case 3:
			System.out.println("Array elements");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println("\nChoose and enter which element to delete");
			Scanner read2 = new Scanner(System.in);
			int element_del = read2.nextInt();
			int pos = Integer.MAX_VALUE;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == element_del) {
					pos = i + 1;
				}
			}
			if (pos == Integer.MAX_VALUE) {
				System.out.println("Sorry entered element not in array");
			} else {
				for (int i = pos - 1; i < array.length - 1; i++) {
					array[i] = array[i + 1];
				}
				array[array.length - 1] = 0;
			}
			System.out.println("\nArray after deleting element");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}

			break;
		case 4:
			System.out.println("String array elements");
			for (int i = 0; i < str_arry.length; i++) {
				System.out.print(str_arry[i] + " ");
			}
			System.out.println("\nChoose and enter which string to delete");
			Scanner read3 = new Scanner(System.in);
			String string_del = "";
			string_del = read3.next();
			int pos1 = Integer.MAX_VALUE;
			for (int i = 0; i < str_arry.length; i++) {
				if (str_arry[i].equals(string_del)) {
					pos1 = i + 1;
					break;
				}
			}
			if (pos1 == Integer.MAX_VALUE) {
				System.out.println("Sorry entered string not in array");
			} else {
				for (int i = pos1 - 1; i < str_arry.length - 1; i++) {
					str_arry[i] = str_arry[i + 1];
				}
				str_arry[array.length - 1] = "";

				System.out.println("\nArray after deleting string");
				for (int i = 0; i < str_arry.length; i++) {
					System.out.print(str_arry[i] + " ");
				}
			}

			break;
		default:
			System.out.println("Please enter valid input(1-4");
			break;
		}

	}

}
