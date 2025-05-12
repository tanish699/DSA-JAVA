// package Sorting;

public class bubble {

    public static void bubbleSort(int[] arr){
        for(int i=arr.length-1; i>0; i--){
            for(int j = 0; j <i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,3,4,2,5,6,9,8,7};
        for(int x: array){
            System.out.print(x);
        }
        System.out.println(" ");
        
        bubbleSort(array);
        for(int x: array){
            System.out.print(x);
        }
    }
    
}
