class Solution {
    public int maxArea(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        int leftMax = nums[0];
        int rightMax = nums[nums.length-1];

        int maxWater = 0;

        while(left<right){
            leftMax = Math.max(leftMax,nums[left]);
            rightMax = Math.max(rightMax,nums[right]);

            int h  = Math.min(leftMax,rightMax);
            int water = h*(right-left);

            if(leftMax<rightMax){
                left++;
            }else{
                right--;
            }

            maxWater = Math.max(maxWater,water);
        }

        return maxWater;
    }
}
