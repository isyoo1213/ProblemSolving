package main.arithmeticSequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 * 입력
 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
 * 출력
 * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */

public class Ps1BR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(arithmeticSequence(Integer.parseInt(br.readLine())));
    }

    private static int arithmeticSequence(int number) {
        int count = 0;
        if (number < 100) {
            count = number;
        } else {
            count = 99;
            for (int i = 100; i <= number; i++) {
                int hundred = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hundred - ten) == (ten - one)) {
                    count++;
                }
            }
        }
        return count;
    }
}
