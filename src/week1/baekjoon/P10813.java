package week1.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(i+1);
        }

        for(int i = 0; i< t; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int j = a;
            int temp = list.get(j-1);
            list.set(j-1, list.get(b-(j-a)-1));
            list.set(b-(j-a)-1, temp);
        }

        list.forEach(e -> System.out.print(e + " "));
    }
}
