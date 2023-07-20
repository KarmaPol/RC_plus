package week1.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P5597 {
    public static void main(String[] args) throws IOException {
        int[] list = new int[30];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i< 28; i++){
            int a = Integer.parseInt(br.readLine());
            list[a-1] = 1;
        }

        for(int i = 0; i< 30; i++){
            if(list[i] == 0) System.out.println(i+1);
        }
    }
}