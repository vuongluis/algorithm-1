package test;

import java.util.ArrayList;
import java.util.Random;

// BugfixingLeaderSorted
@SuppressWarnings("all")
public class Solution {
	public int solution(int A[]) {
	    int result = -1;
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int i = 0;i < A.length;i++){
	    	long total1 = 0;
		    long total2 = 0;
		    for(int j = 0;j < A.length;j++){
		    	if(j>=0 && j < i){
		    		total1 += A[j];
		    	}
		    	if(j > i && j<A.length){
		    		total2 += A[j];
		    	}
		    }
		    if(total1 == total2){
		    	list.add(i);
		    	result = 1;
		    }
		}
	    if(result > 0){
	    	result = list.get(new Random().nextInt(list.size()));
	    }else{
	    	result = -1;
	    }
	    return result;
	}
	public static void main(String[] args) {
		int[] A = {-1, 3, -4, 5, 1, -6, 2, 1};
		System.out.println("Kết quả: "+ new Solution().solution(A));
	}
}
