public class PropertyChecker {

    public boolean hasPositive(int[] arr) {
        // TODO: initialize a boolean flag to false
        boolean flag = false;

        // TODO: loop through arr
        //       if the element is greater than 0, set the flag to true
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                flag = true;
            }
        }
        return flag; // placeholder
    }

    public boolean allPositive(int[] arr) {

        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                flag = false;
            }
        }

        return flag; // placeholder
    }
}