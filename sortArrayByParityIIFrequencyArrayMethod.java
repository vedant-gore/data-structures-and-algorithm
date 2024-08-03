class sortArrayByParityIIFrequencyArrayMethod {
    public int[] sortArrayByParityII(int[] nums) {
        int frequencyArr[] = new int[1001];

        for (int num : nums) {
            frequencyArr[num]++;
        }

        int i = 0;
        for (int j = 0; j < 1001; j += 2) {
            while (frequencyArr[j] > 0) {
                nums[i] = j;
                frequencyArr[j]--;
                i += 2;
            }
        }
        int k = 1;
        for (int j = 1; j < 1001; j += 2) {
            while (frequencyArr[j] > 0) {
                nums[k] = j;
                frequencyArr[j]--;
                k += 2;
            }
        }
        return nums;
    }
}
