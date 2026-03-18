public class Reverser {

    public void reverse(int[] arr) {
        // TODO: declare int left = 0 and int right = arr.length - 1
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // TODO: write a while loop that continues as long as left < right
        //   Inside the loop:
        //     - save arr[left] in a temporary variable
        //     - copy arr[right] into arr[left]
        //     - copy the temporary variable into arr[right]
        //     - increment left
        //     - decrement right
    }
}