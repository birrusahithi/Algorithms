public class BinarySearch {
    public int binarySearch(int [] arr, int x){
       int left =0;
       int right = arr.length-1;
       while(left<=right){
           int med = left + (right-left)/2;
           if(arr[med] ==x){
               return med;
           }
           if(arr[med]<x){
               left = med+1;
           }else{
               right = med-1;
           }
       }
       return -1;
    }
    public static void main(String[] args){
        BinarySearch obj = new BinarySearch();
        int[] arr = {2, 4, 5, 6, 9, 12, 14, 16, 19};
        int x = 14;
        System.out.println(obj.binarySearch(arr, x));

    }
}
