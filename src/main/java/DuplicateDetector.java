public class DuplicateDetector {

    public boolean hasDuplicate(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                }
            }
        }
        return flag; // placeholder
    }
}