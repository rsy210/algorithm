package algorithm.com.dynamicProgramming;

public class LPC {

	public static void main(String[] args) {
		String str = "cbeffboc";
		int num = longestPS(str);
		System.out.println(num);

	}
	public static int longestPS(String str){
		int len = str.length();
		String[] str1 = str.split("");
		
		if(len == 0) return 0;
		int[][] pN = new int[len][len];
		for(int i = 0; i < len; i++){
			for(int j = 0; j + i < len; j++){
				if(j == j + i){
					pN[j][j + i] = 1;
					}else{
						if(str1[j].equals(str1[j + i])){
							pN[j][j + i] = pN[j+1][j + i-1] + 2;
						}else{
							pN[j][j + i] = Math.max(pN[j][j + i-1], pN[j+1][j + i]);
						}
					}
			}
		}
		return pN[0][len-1];
	}

}
