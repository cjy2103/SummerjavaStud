import java.io.*;
import java.util.StringTokenizer;


public class FastBRBW {
    public static void main(String[] args)throws IOException,NumberFormatException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        if(0<T && T<=1000000){
            for(int i=0;i<T;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                if(1<=A && A<=1000 && 1<=B && B<=1000)
                    bw.write(Integer.toString(A+B)+"\n");
            }
            bw.flush();
        }

    }



}

