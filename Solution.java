import java.util.*;
import java.io.*;

public class Solution {
    // For fast input output
    public static class FastReader {
        private BufferedReader br;
        private StringTokenizer st;

        public FastReader() {
            try {
                br = new BufferedReader(
                        new FileReader("input.txt"));
                PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
                System.setOut(out);
            } catch (Exception e) {
                br = new BufferedReader(new InputStreamReader(System.in));
            }
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    // end of fast i/o code
    public static void main(String[] args) {
        FastReader f = new FastReader();  
    }

    private static long gcd (long a, long b) {
        if (a%b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }

    private static long lcm (long a, long b) {
        return a*b /gcd(a, b);
    }
}