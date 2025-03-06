// x ^ 0 = x; x ^ x = 0; x ^ y = y ^ x;
// x ^ y = w; w ^ x = y; w ^ y = x;
class missingandrepeatedvalues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        boolean[] visited = new boolean[n * n + 1];
        int repeatedValue = -1;
        int xorWithoutAB = 0; 
        int xorOfAll = 0;
        int cnt = 1;

        for (var row : grid) {
            for (var element : row) {
                xorWithoutAB ^= element;
                xorOfAll ^= cnt;
                cnt += 1;
                if (repeatedValue == -1) {
                    if (visited[element]) {
                        repeatedValue = element;
                    } else {
                        visited[element] = true;
                    }
                }
            }
        }
        int missingValue = xorWithoutAB ^ xorOfAll ^ repeatedValue;
        return new int[] {repeatedValue, missingValue};
    }
}