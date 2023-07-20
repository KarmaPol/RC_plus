package week1.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringTokenizer;

public class P1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Double> scores = new ArrayList<>();
        for(int i = 0 ; i < t; i++){
            double score = Double.parseDouble(st.nextToken());
            scores.add(score);
        }
        double max = scores.stream().max((a, b) -> (int) (a - b)).get();
        Double tot = scores.stream().map(e -> e / max * 100).reduce(0D, Double::sum);

        System.out.println(tot/(double)t);
    }
}