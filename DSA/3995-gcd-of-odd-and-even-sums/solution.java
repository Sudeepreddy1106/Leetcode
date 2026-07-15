class Solution {
    public int gcdOfOddEvenSums(int n) {
        int k = 0;
        int so = 0;
        int e0 = 0;
        int num=1;
        while (k < 2*n) {
            if (num % 2 == 0) {
                so = so + num;
                k++;
            }
            if (num % 2 != 0) {
                e0 = e0 + num;
                k++;
            }
            num++;
        }
        k = 0;
        int m = Math.max(so, e0);
        int N = Math.min(so, e0);
        while (m!=N) {
            if (m > N) {
                m = m - N;
            } else {
                N = N - m;
            }
        }
        return m;
    }
}
