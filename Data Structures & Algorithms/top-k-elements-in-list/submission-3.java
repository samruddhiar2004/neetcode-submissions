
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // STEP 1: Create the Scoreboard (HashMap)
        Map<Integer, Integer> scoreboard = new HashMap<>();
        for (int num : nums) {
            int currentScore = scoreboard.getOrDefault(num, 0);
            scoreboard.put(num, currentScore + 1);
        }
        
        // STEP 2: Build the Shelves (Buckets)
        List<List<Integer>> shelves = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            shelves.add(new ArrayList<>());
        }
        
        // STEP 3: Put numbers onto their matching shelves
        for (int num : scoreboard.keySet()) {
            int score = scoreboard.get(num);
            shelves.get(score).add(num);
        }
        
        // STEP 4: Grab the top K items using your fixed logic
        int[] result = new int[k];
        int index = 0;
        
        // Loop backwards from the highest frequency shelf to 0
        for (int i = shelves.size() - 1; i >= 0; i--) {
            for (int num : shelves.get(i)) {
                result[index++] = num; // Places num at index, then increments index
                
                if (index == k) {      // Stops as soon as we have collected k items
                    return result;
                }
            }
        }
        
        return result;
    }
}
