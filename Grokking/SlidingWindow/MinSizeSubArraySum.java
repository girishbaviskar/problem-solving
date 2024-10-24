public class MinSizeSubArraySum {
    public static int findMinSubArray(int S, int[] arr) {
        int minLen = Integer.MAX_VALUE;
        int winStart = 0, winSum = 0;
        
        for (int winEnd = 0; winEnd < arr.length; winEnd++) {
            winSum += arr[winEnd];

            while (winSum >= S) {
                minLen = Math.min(minLen,  winEnd - winStart +1);
                winSum -= arr[winStart];
                winStart++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }


    public static void main(String[] args) {
        int result = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 });
        System.out.println("Smallest subarray length: " + result);
        result = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 8 });
        System.out.println("Smallest subarray length: " + result);
        result = MinSizeSubArraySum.findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 });
        System.out.println("Smallest subarray length: " + result);
      }
}
