public class Shifter {

    public void shiftLeft(int[] arr) {
        // TODO: loop from i = 0 to arr.length - 2
        for  (int i = 0; i < arr.length - 1; i++) {
            arr [i] = arr[i+1];
        }
        arr[arr.length - 1] = 0;

        // TODO: set arr[arr.length - 1] to 0
    }

    public void shiftRight(int[] arr) {
        // TODO: loop from i = arr.length - 1 DOWN to i = 1
        for  (int i = arr.length - 1; i >= 1; i--) {
            arr [i] = arr[i-1];
        }
        arr[0] = 0;
    }
}