import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = IntStream.range(0, n).map(i -> Integer.parseInt(st.nextToken())).toArray();

        System.out.printf("%d %d", Arrays.stream(arr).min().getAsInt(), Arrays.stream(arr).max().getAsInt());
    }
}
