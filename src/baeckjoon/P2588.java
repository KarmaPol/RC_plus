package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        int tot = 0;

        for(int i = b.length()-1; i >= 0; i--){
            int temp = (b.charAt(i) - '0') * a;
            System.out.println(temp);
            tot += temp * Math.pow(10,b.length()-1-i);
        }
        System.out.println(tot);
    }
}
