package algorithm;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdex]) {
                    minIdex = j;
                }
            }
            int temp = arr[minIdex];
            arr[minIdex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) 
            System.out.println(arr[i]+ " ");
        System.out.println();
        
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array");
        printArray(arr);

        selectionSort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }
    
}
