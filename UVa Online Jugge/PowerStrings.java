import java.io.*;
import java.util.*;
class PowerStrings{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		StringTokenizer st;
		String cad;

		cad = br.readLine();
		String var1, var2;

		while (!cad.equals(".")) {
			st = new StringTokenizer(cad);
			
			var1 = st.nextToken();
		
			out.println(solve(var1));

			cad = br.readLine();
		}

		out.flush();

	}

	private static int solve(String input){
		
		StringBuilder sb = new StringBuilder();
		String prev = ""+input.charAt(0);
		char v;

		int c, cant;

		cant = 0;
		c = 0;
		for (int i = 0; i < input.length(); i++) {
			v = input.charAt(i);
				if(prev.charAt(c) != v){
						sb.append( v );
						i = i - c;
							
					sb = new StringBuilder(sb.substring(0, sb.length() - c));
					
					prev = sb.toString();
					cant = 1;
					c = 0;

				}else {
					sb.append(v);
					c++;
					if (prev.length() == c) {
						c = 0;
						cant++;
					}
				}
		}

		return cant;

	}

}
