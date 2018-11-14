/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insertremovearraylist;

/**
 *
 * @author chri8160
 */
public class FruitList {

    /**
     * @param args the command line arguments
     */
    static int logicalSize = 5;

    public static void main(String[] args) {
        String fruit[] = new String[10];
        fruit[0] = "Apple";
        fruit[1] = "Banana";
        fruit[2] = "Cherry";
        fruit[3] = "Kiwi";
        fruit[4] = "Pineapple";
        showFruit(fruit);
        System.out.println("Inserting Orange");
        int loc = findInsertPoint(fruit,"Orange");
        insert(fruit,"Orange",loc);
        showFruit(fruit);
        System.out.println("Adding Strawberry and Papaya");
        loc = findInsertPoint(fruit,"Strawberry");
        insert(fruit,"Strawberry",loc);
        loc = findInsertPoint(fruit,"Papaya");
        insert(fruit,"Papaya",loc);
        if(insert(fruit,"Papaya",findInsertPoint(fruit,"Payapa"))){
            System.out.println("Inserted papaya");
        }
        else{
            System.out.println("no");
        }
        System.out.println("\n=============================\n");
        System.out.println("Deleting Cherry");
        delete(fruit,search(fruit,"Cherry"));
        showFruit(fruit);
        System.out.println("Deleting Tomato");
        loc = search(fruit,"Tomato");
        if(delete(fruit,loc)){
            System.out.println("deleted");
        }
        else{
            System.out.println("no");
        }
    }
    
    public static void showFruit(String array[]){
        for (int i = 0; i < logicalSize; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static int search(Object[] a, Object searchValue) {
        int left = 0;
        int right = logicalSize - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a[midpoint]).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;

    }

    public static boolean insert(Object array[], Object newItem, int targetIndex) {
        // Check for a full array and return false if full
        if (logicalSize == array.length) {
            return false;
        }
        // Check for valid target index or return false 
        if (targetIndex < 0 || targetIndex > logicalSize) {
            return false;
        }
        // Shift items down by one position
        for (int i = logicalSize; i > targetIndex; i--) {
            array[i] = array[i - 1];
        }
        // Add new item, increment logical size,return true                       
        array[targetIndex] = newItem;
        logicalSize++;
        return true;
    }

//////////////////////////////////////////////////////////////////////////////////
    public static boolean delete(Object array[], int targetIndex) {
        if (targetIndex < 0 || targetIndex >= logicalSize) {
            return false;
        }

        // Shift items up by one position
        for (int i = targetIndex; i < logicalSize - 1; i++) {
            array[i] = array[i + 1];
        }

        // Decrement logical size and return true 
        logicalSize--;
        return true;
    }

/////////////////////////////////////////////////////////////////////////////////
    public static int findInsertPoint(Object a[], Object searchValue) {
        int left = 0;
        int right = logicalSize - 1;
        int midpoint = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;

            int result = ((Comparable) a[midpoint]).compareTo(searchValue);

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (((Comparable) a[midpoint]).compareTo(searchValue) < 0) {
            midpoint++;
        }
        return midpoint;
    }
}
