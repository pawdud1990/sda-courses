package basic.extras;

public class Ex2 {

    public static void main(String[] args) {
        int[][] arrays = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        int sumOfElementsOnDiagonals = arrays[0][0] + arrays[1][1] + arrays[2][2]
                + arrays[0][2] + arrays[1][1] + arrays[2][0];
        System.out.println("Sum of elements on diagonals: " + sumOfElementsOnDiagonals);

        int sumOfElementsOnEdges = arrays[0][0] + arrays[0][1]+ arrays[0][2]
                + arrays[1][0] + arrays[1][2]
                + arrays[2][0] + arrays[2][1]+ arrays[2][2];
        System.out.println("Sum of elements on edges: " + sumOfElementsOnEdges);
    }
}