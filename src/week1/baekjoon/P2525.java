package week1.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(br.readLine());

        m += t%60;
        if(m > 59) {
            m -= 60;
            h++;
        }
        h += t/60;
        h = h%24;

        System.out.println(Integer.toString(h) + " " + Integer.toString(m));
    }
}
