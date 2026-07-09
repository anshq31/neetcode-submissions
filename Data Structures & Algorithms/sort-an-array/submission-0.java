class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }

    void sort(int [] nums,int l, int r){
        if(l<r){
            int mid = l + (r-l)/2;

            sort(nums,l,mid);
            sort(nums,mid+1,r);
            merge(nums,l,r,mid);
        }
    }

    void merge(int[]nums,int l,int r,int mid){
        int[] temp = new int[r-l+1];
        int i = l, j = mid+1, k =0;
        while(i<= mid && j<= r){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }

        while(i<=mid){
            temp[k++] = nums[i++];
        }

        while(j<=r){
            temp[k++] = nums[j++];
        }

        for(int x = 0;x<temp.length;x++){
            nums[l+x] = temp[x];
        }
    }
}