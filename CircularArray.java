import java.util.Arrays;

public class CircularArray {
    public static void main(String[] args) {
        int[] circularArray = new int[7];
        for (int i = 0; i < 6; i++) {
            circularArray[i] = i + 1;
        }
        System.out.println("Initial array: " + Arrays.toString(circularArray));

        int shiftBy = 2; // Number of positions to shift
        circularRightShift(circularArray, shiftBy);

        System.out.println("Circular array after shifting: " + Arrays.toString(circularArray));
    }

    public static void circularRightShift(int[] array, int shiftBy) {
        int n = array.length;
        int[] temp = new int[n];

        // Perform the circular shift
        for (int i = 0; i < n; i++) {
            int newIndex = (i + shiftBy) % n; // Calculate the new position
            temp[newIndex] = array[i];
        }

        // Copy the shifted elements back to the original array
        System.arraycopy(temp, 0, array, 0, n);
    }
}
