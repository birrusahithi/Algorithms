public class LinearSearch {
    public int linearSearch(int[] arr){
        for(int i =0; i<arr.length; i++){
            if(arr[i]==13){
                return i;
            }
        }
        return -1;
    }
    public static void main( String[] args){
        LinearSearch obj = new LinearSearch();
        int arr[] = {2, 4, 6, 8, 12, 13, 16};
        System.out.println(obj.linearSearch(arr));

    }
}