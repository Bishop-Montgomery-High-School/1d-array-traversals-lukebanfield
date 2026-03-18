public class Rotator {
    public void rotateLeft(int[] arr) {
        int var = arr[0];
        for(int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = var;
    }


    public void rotateRight(int[] arr) {
        int var = arr[arr.length - 1];
        for (int i = arr.length - 1; i >=1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0]  = var;
    }
}