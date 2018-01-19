import java.util.Scanner;

public class Array_operation {

	public static void main(String[] args) {
		int[] array = new int[10];
		array[0] = 1;
		array[1] = 3;
		array[2] = 5;
		array[3] = 2;
		array[4] = 4;
		array[5] = 4;
		array[6] = 8;
		array[7] = 5;
		array[8] = 9;
		array[9] = 4;

		String[] str_arry = new String[10];
		str_arry[0] = "aa";
		str_arry[1] = "bb";
		str_arry[2] = "cc";
		str_arry[3] = "dd";
		str_arry[4] = "ee";
		str_arry[5] = "ff";
		str_arry[6] = "gg";
		str_arry[7] = "gg";
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
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == element_del) {
					count++;
					for (int j = i; j < array.length; j++) {
						if (j < array.length - 1)
							array[j] = array[j + 1];
					}
					array[array.length - count] = 0;
					i--;
				}
			}

			if (count == 0) {
				System.out.println("Sorry entered element not in array");
			} else {
				System.out.println("\nArray after deleting element");
				for (int i = 0; i < array.length - count; i++) {
					System.out.print(array[i] + " ");
				}
			}
			break;
		case 4:
			System.out.println("String array elements");
			for (int i = 0; i < str_arry.length; i++) {
				System.out.print(str_arry[i] + " ");
			}
			System.out.println("\n\nChoose and enter which string to delete");
			Scanner read3 = new Scanner(System.in);
			String string_del = read3.next();
			count = 0;
			
			for (int i = 0; i < str_arry.length; i++) {
				if (str_arry[i].equals(string_del)) {
					count++;					
					for (int j = i; j < str_arry.length; j++) {
						if (j< str_arry.length - 1)
							str_arry[j] = str_arry[j + 1];
					}
					str_arry[str_arry.length - count] = "";
					i--;
				}
			}

			if (count == 0) {
				System.out.println("Sorry entered string not in array");
			} else {
				System.out.println("Array after deleting element");
				for (int i = 0; i < str_arry.length - count; i++) {
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
