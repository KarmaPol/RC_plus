package week1.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t ;i++){
            String temp = br.readLine();
            sb.append(temp.charAt(0)).append(temp.charAt(temp.length()-1)).append('\n');
        }
        System.out.println(sb.toString());
    }
}
