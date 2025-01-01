public class maxscoresplit {
    public int maxScore(String s) {
        int maxScore = 0;
        int n = s.length();

        int totalOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                totalOnes++;
            }
        }

        int leftZeros = 0;
        int rightOnes = totalOnes;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                rightOnes--;
            }

            int score = leftZeros + rightOnes;
            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }
}

// import java.util.*;
// class Solution {
//     public int maxScore(String s) {
//         int[] num=Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();
//         int count1=0;
//         int count2=0;
//         int n=num.length;
//         int fin=0;
//         for(int i=0;i<n;i++){
//             if(num[i]==1){
//                 fin=i;
//                 break;
//             }
//             else{
//                 count1++;
//             }
//         }
//         for(int i=fin;i<n;i++){
//             if(num[i]==1){
//                 count2++;
//             }
//         }
//         return count1+count2;
//     }
// }