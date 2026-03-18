public class MinMax {
    public int min(int[] arr) {
        int tracking = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < tracking) {
                tracking = arr[i];
            }
        }
        return tracking;
    }

    public int max(int[] arr) {
        int tracking = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > tracking) {
                tracking = arr[i];
            }
        }
        return tracking; // placeholder
    }
}