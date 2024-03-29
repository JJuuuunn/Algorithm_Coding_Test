package ProgrammersSchool.Java.Lv1;

public class 삼총사 {
    public static void main(String[] args) {
        int[] number = {-2, 3, 0, 2, -5};
        System.out.println(solution(number)); // 2

        number = new int[] {-3, -2, -1, 0, 1, 2, 3};
        System.out.println(solution(number)); // 5

        number = new int[] {-1, 1, -1, 1};
        System.out.println(solution(number)); // 0
    }

    public static int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
