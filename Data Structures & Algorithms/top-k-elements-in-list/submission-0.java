

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {

            int maxFreq = 0;
            int maxElement = 0;

            // Find element with maximum frequency
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxElement = entry.getKey();
                }
            }

            result[i] = maxElement;

            // Remove selected element
            map.remove(maxElement);
        }

        return result;
    }
}
