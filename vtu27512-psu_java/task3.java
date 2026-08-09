public class task3 {

    // Function to perform Binary Search
    static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If element is found
            if (arr[mid] == x) {
                return mid;
            }

            // If x is greater, search in the right half
            if (arr[mid] < x) {
                low = mid + 1;
            }
            // If x is smaller, search in the left half
            else {
                high = mid - 1;
            }
        }

        // Element not found
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;

        int result = binarySearch(arr, x);

        if (result == -1) {
            System.out.println("Element is not present in the array.");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}