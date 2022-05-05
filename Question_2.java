import java.util.Scanner;

class Question_2 {
    public static void insert_in_array(int arr[], int num, int index)
    // seperate function to insert the element inside
    // a new array.
    {
        int newarr[] = new int[arr.length + 1];
        for (int x = 0; x < 7; x++) {
            if (x < index - 1) // -1 as the position inside the array starts from 0;
                newarr[x] = arr[x];
            else if (x == index - 1)
                newarr[x] = num;
            else
                newarr[x] = arr[x - 1];
        }
        for (int x = 0; x < newarr.length; x++)
            System.out.print(newarr[x] + " "); // printing the new array
    }

    public static void main(String args[]) // main function
    {
        Scanner scan = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        System.out.println("Enter the index:");
        int index = scan.nextInt();
        insert_in_array(arr, num, index); // calling the insert_in_array function to insert the element at the index
    }
}