class Solution {
    public int[] twoSum(int[] nums, int target) {
        //BRUTE FORCE APPROACH
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[] {};


    // HASHMAP APPROACH
        HashMap<Integer,Integer> num=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int complement=target-nums[i];
        if(num.containsKey(complement)){
            return new int[] {num.get(complement),i};
        }
        num.put(nums[i],i);
       }

       return new int[] {};



    //TWO POINTER APPRAOCH

    // int left=0;
    // int right=nums.length-1;

    // while(left<right){
    //     int currentSum=nums[left]+nums[right];

    //     if(currentSum==target){
    //         return new int[] {left,right};
    //     }
    //     else if(currentSum<target){
    //         left++;
    //     }
    //     else{
    //         right--;
    //     }
    // }

    // return new int[] {};
        
    }
}
