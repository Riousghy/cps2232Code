import java.util.Scanner;

public class DoubleArraySizeMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myList = new int[2];
        System.out.println("Last index: " + (myList.length - 1));

        while (true) {
            System.out.println("Enter " + myList.length + " Values:");
            System.out.println("Array is: ");

            for (int i = 0; i < myList.length; i++) {
                myList[i] = input.nextInt();
                if (myList[i] == -1) {
                    System.out.println("End of input!");
                    System.exit(0);
                }
                System.out.print(myList[i] + " ");
            }
            System.out.println();

            if (myList[myList.length - 1] != -1) {
                myList = doubleArraySize(myList);
                System.out.println("new Array last index: " + (myList.length - 1));
                System.out.println("Enter " + myList.length + " Values:");
            }
        }
    }

    public static int[] doubleArraySize(int[] originalArray) {
        int[] newArray = new int[originalArray.length * 2];
        for (int j = 0; j < originalArray.length; j++) {
            newArray[j] = originalArray[j];
        }
        return newArray;
    }
}
