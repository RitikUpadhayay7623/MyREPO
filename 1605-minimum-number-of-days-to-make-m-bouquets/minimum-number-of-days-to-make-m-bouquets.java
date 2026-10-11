class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        if ((long) m * k > n) {
            return -1;
        }

        int low = 0;
        int high =0;

        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(bloomDay, mid, m, k)) {
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    static boolean possible(int[] bloomDay, int day, int m, int k) {
        int count = 0;
        int bouquets = 0;

        for (int val : bloomDay) {
            if (val <= day) {
                count++;

                if (count == k) {
                    bouquets++;
                    count = 0;

                    if (bouquets >= m) {
                        return true;
                    }
                }
            } else {
                count = 0;
            }
        }

        return false;
    }
}