public class MergeSort {
    public void merge(int arr[], int left, int medium, int right) {
        int n1 = medium - left + 1;
        int n2 = right - medium;
        int[] Leftside = new int[n1];
        int[] Rightside = new int[n2];
        for(int i =0; i<n1; i++){
            Leftside[i] = arr[left+i];
        }
        for(int j =0; j<n2; j++){
            Rightside[j] = arr[medium + 1 +j];
        }
        int i =0, j=0;
        int k = left;
        while(i<n1 && j<n2){
            if(Leftside[i]<=Rightside[j]){
                arr[k] = Leftside[i];
                i++;
            } else{
                arr[k] = Rightside[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = Leftside[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = Rightside[j];
            j++;
            k++;
        }
    }

    public void sort(int[] arr, int left, int right) {
        if (left < right) {
            int med = left + (right - left) / 2;
            sort(arr, left, med);
            sort(arr, med + 1, right);
            merge(arr,left,med, right);
        }
    }
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        int[] arr = {9, 10, 1, 2, 13, 4, 0, 6};
        obj.sort(arr, 0, arr.length - 1);
        obj.printArray(arr);

    }
}
