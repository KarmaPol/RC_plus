package week1.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringTokenizer;

public class P2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int idx = -1;
        for(int i = 1; i <= 9; i++) {
            int temp = Integer.parseInt(br.readLine());
            if(temp > max) {
                max = temp;
                idx = i;
            }
        }


        System.out.println(max);
        System.out.println(idx);
    }
}
