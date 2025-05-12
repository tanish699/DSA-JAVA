// package Sorting;

public class Selection {

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length;i++){
            int minIndex = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(i!=minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
    }

    public static void main(String[] args) {
        int[] array = {4,6,3,7,1};
        for(int x: array){
            System.out.print(x);
        }
        System.out.println(" ");
        
        selectionSort(array);
        for(int x: array){
            System.out.print(x);
        }
    }
    
}
