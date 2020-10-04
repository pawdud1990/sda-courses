package basic.day2;

public class Ex14 {

    public static void main(String[] args) {
        int[] arrays = {12, -7, 19, -5};
        int lengthNewArray = countNegativeDigits(arrays);
        int[] negativeDigits = createArrayWithNegativeDigits(lengthNewArray, arrays);

        if(lengthNewArray > 0) {
            for (int element : negativeDigits) {
                System.out.print(element + " ");
            }
        }
    }

    private static int countNegativeDigits(int[] arrays) {
        int counter = 0;
        for(int element : arrays) {
            if(element < 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int[] createArrayWithNegativeDigits(int length, int[] arrays) {
        int[] newArray = new int[length];
        for (int i = 0, j = 0; i < arrays.length; i++) {
           if(arrays[i] < 0) {
               newArray[j] = arrays[i];
               j++;
           }
        }
        return newArray;
    }
}