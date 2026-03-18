public class Counter {
    public int countAbove(int[] arr, int threshold) {
        int counter = 0;
        for (int i : arr) {
            if (i > threshold) {
                counter++;
            }
        }
        return counter;
    }

    public int countBelow(int[] arr, int threshold) {
       int counter = 0;
       for (int i : arr) {
           if (i < threshold) {
               counter++;
           }
       }
        return counter; // placeholder
    }

    public int countEqual(int[] arr, int target) {
        int counter = 0;
        for (int i : arr) {
            if (i == target) {
                counter++;
            }
        }
        return counter;
    }
}