package week1.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String ans = "int";

        for(int i = 0; i < n/4; i++){
            ans = "long " + ans;
        }

        System.out.println(ans);
    }
}
