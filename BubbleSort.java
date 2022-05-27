public class BubbleSort {
    public void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i =0; i<n-1; i++){
            for(int j =0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public void print(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.println();
        }
    }
public static void main(String[] args){
    BubbleSort obj = new BubbleSort();
    int arr[] = {9, 10,1,2,13, 4,0,6};
    obj.bubbleSort(arr);
    obj.print(arr);
}
}
