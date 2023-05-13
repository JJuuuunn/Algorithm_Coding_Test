import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        int lastIn = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();


            switch (command) {
                case "push" :
                    int num = Integer.parseInt(st.nextToken());
                    queue.add(num);
                    lastIn = num;
                    break;

                case "pop" :
                    sb.append(queue.isEmpty() ? "-1" : queue.poll()).append("\n");
                    break;


                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;

                case "empty" :
                    sb.append(queue.isEmpty() ? "1" : "0").append("\n");
                    break;

                case "front" :
                    sb.append(queue.isEmpty() ? "-1" : queue.peek()).append("\n");
                    break;

                case "back" :
                    sb.append(queue.isEmpty() ? "-1" : lastIn).append("\n");
                    break;
            }

        }
        System.out.println(sb);

    }
}