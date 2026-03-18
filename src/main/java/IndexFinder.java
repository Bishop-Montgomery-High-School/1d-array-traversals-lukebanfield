public class IndexFinder {

    public int indexOfMin(int[] arr) {
        int min = arr[0];
        int indexToReturn = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexToReturn = i;
            }
        }
        return indexToReturn;
    }

    public int indexOfMax(int[] arr) {
        int max = arr[0];
        int indexToReturn = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexToReturn = i;
            }
        }
        return indexToReturn; // placeholder
    }
}