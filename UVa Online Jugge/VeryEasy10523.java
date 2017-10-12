import java.io.*;
import java.util.*;
import java.math.BigInteger;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VeryEasy10523
{
    public static void main(String[] arg)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String cad;
        PrintWriter out = new PrintWriter(System.out);
        int n;
        cad = br.readLine();
        BigInteger answer,mult,a,var,n1,dividendo,divisor;
        while(cad != null){
            st = new StringTokenizer(cad);
            n = Integer.parseInt(st.nextToken()) + 1;
            a = new BigInteger(st.nextToken());
            if(a.compareTo(BigInteger.ONE) == 0){
                n = n*(n-1)/2;
                out.println(n);
            }else{
                answer = BigInteger.ZERO;
                mult = BigInteger.ONE;
                var = BigInteger.ONE;
                n1 = new BigInteger(""+(n-1));
                dividendo = (a.subtract(new BigInteger(""+n).multiply(a.pow(n))).add(n1.multiply(a.pow(n+1))) ); 
                divisor = ((BigInteger.ONE).subtract(a)).pow(2);
                answer = dividendo.divide(divisor);
                out.println(answer);
            }
            cad = br.readLine();
        }
        out.flush();
    }
}
