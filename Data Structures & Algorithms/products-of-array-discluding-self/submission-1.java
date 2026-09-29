class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        
        // Step 1: Calculate left prefix products
        // output[i] contains the product of all elements to the left of i
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            output[i] = leftProduct;
            leftProduct *= nums[i];
        }
        
        // Step 2: Calculate right suffix products on the fly
        // Multiply the existing left product by the cumulative right product
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return output;
    }
}
