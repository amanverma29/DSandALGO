package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetOfArray {

	public static void main(String[] args) {
		
			int result[][] = subsets(new int[]{1,2,3});
			for (int[] is : result) {
				for(int j : is) {
					 System.out.println(j);
			}
				System.out.println();
	}
	}
	public static int[][] subsets(int[] A){
		        Arrays.sort(A);
		        int len = A.length;
		        int counter = (int) Math.pow(2,len);
		        int res[][] =new int[counter][];
		        for(int i=0;i<counter;i++){
		            List<Integer> combos=new ArrayList<>();
		            for(int j=0;j<len;j++){
		                if((i & (1<<j)) != 0){
		                	combos.add(A[j]);
		                }
		                
		            }
		           
		            res[i] =  combos.stream().mapToInt(k -> k).toArray();
		        }
		        return res;
		    }
		
		
	}


