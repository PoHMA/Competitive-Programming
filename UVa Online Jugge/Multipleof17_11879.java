import java.io.*;
import java.math.BigInteger;
class Multipleof17_11879{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		String input = br.readLine();
		BigInteger n,div;
		div = new BigInteger("17");
		int answer;
		
		while (!input.equals("0")) {

			n = new BigInteger(input);

			answer = n.mod(div).toString().equals("0")? 1:0; 
			
			out.println(answer);

			input = br.readLine();
		}
		out.flush();
	}
}