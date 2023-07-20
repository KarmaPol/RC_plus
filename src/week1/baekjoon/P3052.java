package week1.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] mods = new int[42];

        for(int i = 0; i< 10; i++){
            int n = Integer.parseInt(br.readLine());
            mods[n%42]++;
        }
        int ans = 0;
        for(int i = 0; i< 42; i++){
            if(mods[i] != 0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
