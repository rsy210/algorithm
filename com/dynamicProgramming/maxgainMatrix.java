package algorithm.com.dynamicProgramming;

public class maxgainMatrix {
	public static void main(String[] args) {
		int[][] num = {{0,0,8,0,0},{0,0,0,9,0},{0,7,0,0,0},{0,0,6,0,0}};
		int longnum = maxPri(num);
		System.out.println(longnum);
	}

public static int maxPri(int[][] num){
	int m = num.length;
	int n = num[0].length;
	if(m == 0){
	    return m;//Пе
	  }
	
	int[][] max = new int[m][n];
	  
	    for(int i = 0; i<m; i++){
	      for(int j = 0; j<n; j++){
	        if(i == 0 &&  j == 0){
	          max[i][j] = num[i][j];
	        }
	       else if(i == 0){
	          max[i][j] = max[i][j-1] + num[i][j];
	        }
	       else if(j == 0){
	          max[i][j] = max[i-1][j] + num[i][j];
	       }else{
	        max[i][j] = Math.max(max[i][j-1], max[i-1][j]) + num[i][j];
	       }
	      }
	     }
	  return max[m-1][n-1];
	}
}
