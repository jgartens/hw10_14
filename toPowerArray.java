


public class toPowerArray {
    public static void main(String[] args) {
        int[] myArray = toPowerArray.toPower(4, 3);
        for (int num : myArray){
            System.out.printf("%d ", num);
        }        
    }

    //Question 3: function which creates an array of size "size" which contains each index value rasied to power of "power"
    public static int[] toPower(int size, int power){
        int [] myArray = new int[size];

        for (int i = 0; i < size; i++){
            myArray[i] = (int)Math.pow(i, power);
        }
        return myArray;
    }

    
}
