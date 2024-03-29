package ProgrammersSchool.Java.Lv1;

import java.util.Arrays;

public class 평균_구하기 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(solution(arr)); // 2.5

        arr = new int[]{5, 5};
        System.out.println(solution(arr)); // 5
    }

    public static double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}
