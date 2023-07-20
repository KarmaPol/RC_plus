package week1.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringTokenizer;

public class P10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Optional<Integer> max = list.stream().max((a, b) -> a - b);
        Optional<Integer> min = list.stream().min((a, b) -> a - b);

        System.out.println(min.get() + " " + max.get());
    }
}
