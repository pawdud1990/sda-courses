package basic.day2;

import java.util.Arrays;

public class Ex13 {

    public static void main(String[] args) {
        int[] arrays = {12, 7, 19};

        int minValue = getMinValue(arrays);
        System.out.println("Min value: " + minValue);

        int maxValue = getMaxValue(arrays);
        System.out.println("Max value: " + maxValue);

        int sum = getSum(arrays);
        System.out.println("Total sum: " + sum);
    }

    private static int getMinValue(int[] arrays) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arrays.length; i++) {
            if(minValue > arrays[i]) {
                minValue = arrays[i];
            }
        }
        return minValue;
        /*return Arrays.stream(arrays)
                .min()
                .getAsInt();*/
    }

    private static int getMaxValue(int[] arrays) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arrays.length; i++) {
            if(maxValue < arrays[i]) {
                maxValue = arrays[i];
            }
        }
        return maxValue;
        /*return Arrays.stream(arrays)
                .max()
                .getAsInt();*/
    }

    private static int getSum(int[] arrays) {
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        /*for (int i : arrays) {
            sum += i;
        }*/
        return sum;
        /*return Arrays.stream(arrays)
                .sum();*/
    }
}