import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int num = Integer.parseInt(br.readLine());

        int l = 0;
        int r = n - 1;
        int cnt = 0;
        int sum = 0;
        
        while (l < r) {
            sum = arr[l] + arr[r];
            if (sum == num) cnt++;

            if (sum < num) l++;
            else r--;

            if (l == r) break;
        }

        System.out.println(cnt);
    }
}