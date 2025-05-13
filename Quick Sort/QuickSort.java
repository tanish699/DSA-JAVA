// package Quick Sort;

import java.util.Arrays;

public class QuickSort {

    public static void swap(int[] arr, int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    public static int pviot(int[] arr, int pviotIndex, int endIndex){
        int swapIndex = pviotIndex;
        for(int i = pviotIndex + 1; i<=endIndex;i++){
            if(arr[i] < arr[pviotIndex]){
                swapIndex++;
                swap(arr, swapIndex, i);
            }
        }
        swap(arr, swapIndex, pviotIndex);
        return swapIndex;

    }

    public static void quickSort(int[] arr, int left, int right){
        if(left<right){
            int pviotIndex = pviot(arr, left, right);
            quickSort(arr, left, pviotIndex - 1);
            quickSort(arr, pviotIndex + 1, right);
        }

    }

    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1,69,99,87,89};

        quickSort(arr, 0, 11);
        System.out.println(Arrays.toString(arr));
    }
    
}
