/**
 * sumArray
 */

//class to fulfil questions 1 and 2 of hw10_14
public class sumArray {

    public static void main(String[] args) {
        sumArray example = new sumArray();
        int[] myArray = {1, 5, 7, 90, 3, -1};
        System.out.printf("Sum of the number in myArray is: %d\n", example.get_sum(myArray));
    }

    //method to sum all the values of a given arrray
    public int get_sum(int[] array){
        int total = 0;
        for (int i = 0; i < array.length; i ++){
            total += array[i];
        }
        return total;
    }
}

/*
the maximum of the array is exampleArray[2] = 6;
So the output will be:
"2"
*/