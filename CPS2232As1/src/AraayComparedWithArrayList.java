import java.util.ArrayList;

    public class AraayComparedWithArrayList {

        public static void main(String[] args) {
            //The difference of size and type
            int[] intArray = new int[5];
            //here we specify the size of an array, the type is int, a private type.
            ArrayList<Integer> arrayList = new ArrayList<>();
            //create the arraylist,but we don't need to specify the size, the type is object,Integer


            //the difference of how to change
            intArray[0] = 1;
            intArray[1] = 2;
            intArray[2] = 3;
            // array should manually manage resizing and copying elements

            arrayList.add(0);        // Add an element
            arrayList.remove(0);     // Remove an element
            int size = arrayList.size(); // Get the size
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            //arraylist provide method to act

            // Accessing elements
            System.out.println("Array Element at index 0: " + intArray[0]);
            System.out.println("ArrayList Element at index 0: " + arrayList.get(0));

            // Size
            System.out.println("Array Length: " + intArray.length);
            System.out.println("ArrayList Size: " + arrayList.size());
        }
    }


