import java.io.*;
import java.util.*;
class WhatBaseIsThis{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String cad;

		cad = br.readLine();
		String var1, var2;
		while (cad != null) {
			st = new StringTokenizer(cad);
			
			var1 = st.nextToken();
			var2 = st.nextToken();
			
			System.out.println(solve(var1,var2));

			cad = br.readLine();
		}

	}

	private static String solve(String var1, String var2){
		StringBuilder answer = new StringBuilder();
		HashMap<Integer, Integer> map = new HashMap();
		int sum, mult, base,  tam;
		boolean end;

		tam = var1.length();
		base = detectedBase(var1, tam);

		for (int i = base; i <= 36; i++) {
			sum = 0;
			mult = 1;
			for (int j = tam-1; j >= 0; j--) {
				sum = sum + (isNumber(var1.charAt(j)) ? (int)(var1.charAt(j)-'0')*mult : ( (int)(var1.charAt(j)-'A') + 10)*mult );
				mult = mult*i;
			}
			
			if (!map.containsKey(sum)) {
				map.put(sum,i);
			}

		}

		end = false;

		tam = var2.length();
		base = detectedBase(var2,tam);

		for (int i = base; i <= 36 && !end; i++) {
			sum = 0;
			
			mult = 1;

			for (int j = tam-1; j >= 0; j--) {
				sum = sum + (isNumber(var2.charAt(j)) ? (int)(var2.charAt(j)-'0')*mult : ( (int)(var2.charAt(j)-'A') + 10)*mult );
				mult = mult*i;
			}
		
			if (map.containsKey(sum)) {
				answer.append(var1);
				answer.append(" (base ");
				answer.append(map.get(sum));
				answer.append(") = ");
				answer.append(var2);
				answer.append(" (base ");
				answer.append(i);
				answer.append(")");
				end = true;
			}

		}

		if (!end) {
			answer.append(var1);
			answer.append(" is not equal to ");
			answer.append(var2);
			answer.append(" in any base 2..36");
		}

		return answer.toString();
	}

	private static int detectedBase(String var, int tam){
		int answer = 0;

		for (int j = 0; j < tam; j++) {
			answer = Math.max((isNumber(var.charAt(j)) ? (int)(var.charAt(j)-'0') : ( (int)(var.charAt(j)-'A') + 10) ),answer);
		}
		
		answer++;

		if (answer == 1) {
			answer++;
		}
		return answer;
	}

	private static boolean isNumber(char var){
		return var >= '0' && var<= '9';
	}

}
