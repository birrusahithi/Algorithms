public class SortColors {
        public void sortColors(int[] nums) {
            int first=0;
            int cur =0;
            int last = nums.length-1;
            while(cur<=last){
                if(nums[cur]==0){
                    int temp = nums[cur];
                    nums[cur]=nums[first];
                    nums[first]=temp;
                    first++;
                    cur++;
                }else if(nums[cur]==2){
                    int temp = nums[cur];
                    nums[cur]= nums[last];
                    nums[last] = temp;
                    last--;

                }
                else{
                    cur++;
                }
            }
        }
    }
