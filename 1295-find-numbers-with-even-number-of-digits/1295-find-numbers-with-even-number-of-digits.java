class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {

            int digitCount = 0;
            int temp = num;

            while (temp > 0) {
                temp /= 10;
                digitCount++;
            }

            if (digitCount % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}