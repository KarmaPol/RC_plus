package week1.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        String ans;
        if(score >= 90) ans = "A";
        else if(score >= 80) ans = "B";
        else if(score >= 70) ans = "C";
        else if(score >= 60) ans = "D";
        else ans = "F";

        System.out.println(ans);
    }
}
