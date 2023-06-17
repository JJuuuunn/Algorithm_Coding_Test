import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
        
        Arrays.sort(arr);
        
        System.out.println(arr[1]);
    }
}