class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> ans = new HashMap<>();
        for(int i = 0; i < nums.length ;i++){
            if(ans.containsKey(target - nums[i])){
                return new int[]{i,ans.get(target-nums[i])};
            }
            ans.put(nums[i],i);
        }
        return new int[]{
            
        };

    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]+nums[j] == target){
    //                 int a[] = {i,j};
    //                 return a;
    //             }
    //     }   
    // }
    // return null;

    
    }
}
   