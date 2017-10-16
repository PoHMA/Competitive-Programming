import java.io.*;
import java.util.*;
class DigitCounting{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int test,n;
		test = Integer.parseInt(st.nextToken());
		
		int[] answer;

		for (int t = 1; t <= test; t++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			answer = countNumbers(n);
			out.println(convertToString(answer));
		}
		out.flush();
	}

	private static int[] countNumbers(int n){
		int[] answer = new int[10];
		int var;
		for (int i = 1; i <= n; i++) {
			var = i;
			while (var  >= 10) {
				answer[var%10]++;
				var/=10;
			}
			answer[var]++;
		}
		return answer;
	}

	private static String convertToString(int[] array){
		StringBuffer answer = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			answer.append(array[i]);
			if(i != array.length-1)
			 answer.append(" ");
		}
		return answer.toString();
	}


}
