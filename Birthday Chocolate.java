public class Solution {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int sum, j, k;
        int count = 0; 
        
        // Iterates through the list until m indexes before the end. If we're going to add
        // the k element of the list with the m elements after, than we must stop m indexes
        // before the end, unless we want a PointerException.
        for (int i = 0; i <= s.size() - m; i++) {
            k = i;
            sum = 0;
            j = 1;
            while (j <= m) {
                sum = sum + s.get(k);
                k++;
                j++;
            }
            if (sum == d)
                count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
