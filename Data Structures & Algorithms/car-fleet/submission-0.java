class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int [][] nums = new int[position.length][2];
        for(int  i = 0;i<position.length;i++){
            nums[i][0] = position[i];
            nums[i][1] = speed[i]; 
        }

        Arrays.sort(nums , (a,b) -> Integer.compare(b[0],a[0]));

        Stack<Double> stack = new Stack<>();
        for(int[] num :nums){
            stack.push((double)(target - num[0])/num[1]);
            if(stack.size() >= 2 && 
            stack.peek() <= stack.get(stack.size()-2)){
                stack.pop();
            }
        }
        return stack.size();
    }
}
