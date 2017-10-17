import java.io.*;
import java.util.*;
class PeterSmokes{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st;
		String cad;
		int n,k,cigarettes, residuo,ncigarrittes;

		cad = br.readLine();

		while (cad != null) {
			st = new StringTokenizer(cad);
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			cigarettes = 0;

			do{

				residuo = n%k;
				
				cigarettes += n - residuo;

				ncigarrittes = n/k;
				n = residuo+ncigarrittes;

			}while (n >= k);
			
			cigarettes += n;

			out.println(cigarettes);

			cad = br.readLine();
		}

		out.flush();
	}

}
