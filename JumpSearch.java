class JumpSearch{
    public int jumpSearch(int[] arr, int x){
        int n = arr.length;
        double sqrt = Math.sqrt(n);
        int step = (int) Math.floor(sqrt);
        int prev =0;
        while(arr[Math.min(step,n)-1]<x) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1;
            }
        }

            while (arr[prev] < x) {
                prev++;
                if (prev == Math.min(step, n))
                    return -1;
            }
            if (arr[prev] == x) {
                return prev;
            }

            return -1;
    }
    public static void main(String[] args){
        JumpSearch obj = new JumpSearch();
        int arr[] = {2, 4, 5, 6, 9, 12, 14, 16, 19};
        int x = 14;
        System.out.println(obj.jumpSearch(arr, x));

    }
}