public class Insertion {
    
    public static void insertionSort(int[] arr){
        for(int i = 1; i<arr.length;i++){
            int temp = arr[i];
            int j = i - 1;
            while(j> -1 && temp < arr[j]){
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }

        }
    }

    public static void main(String[] args) {
        int[] array = {1,3,4,2,5,6,9,8,7};
        for(int x: array){
            System.out.print(x);
        }
        System.out.println(" ");
        
        insertionSort(array);
        for(int x: array){
            System.out.print(x);
        }
    }
}
