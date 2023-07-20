package week1.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tot = Integer.parseInt(br.readLine());

        int t = Integer.parseInt(br.readLine());

        int a, b;
        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            tot -= a*b;
        }

        if(tot == 0) System.out.println("Yes");
        else System.out.printf("No");
    }
}
