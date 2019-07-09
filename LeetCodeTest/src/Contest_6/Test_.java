package Contest_6;

/**
 * @Author-- Skipper
 */
class Solution {
    public void duplicateZeros(int[] arr) {
        int[] rewrite = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                rewrite[i] = 0;
                if (i + 1 < arr.length) {
                    rewrite[i + 1] = 0;
                    if (i + 2 < arr.length) {
                        rewrite[i + 2] = arr[i + 1];
                    }
                }
                i += 2;
                while (arr[i] != 0){
                    rewrite[i] = arr[i];
                    i++;
                }
            } else {
                rewrite[i] = arr[i];
            }
        }
        System.arraycopy(rewrite, 0, arr, 0, arr.length);
    }
}
