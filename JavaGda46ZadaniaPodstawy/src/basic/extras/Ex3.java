package basic.extras;

public class Ex3 {

    public static void main(String[] args) {
        int[][] arrays = new int[3][10];
        for(int i = 0; i < 10; i++) {
            arrays[0][i] = i + 1;
            arrays[1][i] = arrays[0][i] * arrays[0][i];
            arrays[2][i] = arrays[1][i] * arrays[0][i];
        }

        for(int[] a: arrays) {
            for(int element : a) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}