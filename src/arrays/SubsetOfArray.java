package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SubsetOfArray {

	public static void main(String[] args) {
			int result[][] = subsets(new int[]{2,1,3});
			Arrays.sort(result, new Comparator<int[]>() {
				@Override
				public int compare(int[] a, int[] b) {
			         int an = a.length;
		                int bn = b.length;
		                for (int i = 0; i < Math.min(an, bn); i++) {
		                    int cmp = Integer.compare(a[i], b[i]);
		                    if (cmp != 0)
		                        return cmp;
		                }
		                return Integer.compare(a.length, b.length);
					
					
					
				/*
				 * int comp =0; if(o2.length !=0) { comp=(o1[0] < o2[0]) ? -1 : ((o1[0] ==
				 * o2[0]) ? 0 : 1); } return comp;
				 */
				}			
			});
			for (int[] is : result) {
				for(int j : is) {
					 System.out.print("["+j+"]");
			}
				System.out.print(",");
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


