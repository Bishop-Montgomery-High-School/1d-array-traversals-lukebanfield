public class SumAverage {
    public int sum(int[] arr) {
        int accumulator = 0;
        for (int i = 0; i < arr.length; i++) {
            accumulator += arr[i];
        }
        return accumulator;
    }


    public int average(int[] arr) {
        // TODO: compute the sum of all elements (you may call sum(arr) or loop again)
        int sum = sum(arr);
        int length = arr.length;
        int average = sum / length;

        // TODO: divide the sum by arr.length (integer division — no cast needed)



        // TODO: return the result
        return average; // placeholder
    }
}