class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[] {};

        HashMap<Integer,Integer> num=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int complement=target-nums[i];
        if(num.containsKey(complement)){
            return new int[] {num.get(complement),i};
        }
        num.put(nums[i],i);
       }

       return new int[] {};

        
    }
}
