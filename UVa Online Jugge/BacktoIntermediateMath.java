import java.io.*;
import java.util.*;
class BacktoIntermediateMath{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int test = Integer.parseInt(st.nextToken());
		double d,v,u,t1,t2, res, v_ini;
		String answer;

		for (int t = 1; t <= test; t++) {
			st = new StringTokenizer(br.readLine());
			d = Double.parseDouble(st.nextToken());
			v = Double.parseDouble(st.nextToken());
			u = Double.parseDouble(st.nextToken());
			res = u-v;
			answer = "Case "+t+": ";
			if (res <= 0 || v == 0 || u == 0) {
				answer += "can't determine";
			}else {
				v_ini = Math.sqrt(u*u - v*v);
				t1 = d/u;
				t2 = d/v_ini;
				answer += String.format("%.3f", Math.abs(t1-t2));
			}
			out.println(answer);
		}
		out.flush();
	}
}
