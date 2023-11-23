class SortArray {

    public static void main(String[] args) {         //main method
        int[] array = {92, 33, -2, 43, 0, 69, -17};   

        int temp;
        for (int i = 0; i < array.length; i++) {         //iterate array with for loop
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {                 //if loop
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
   
        System.out.println("The sorted array is:");   // Print the sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);             
        }
    }
}
