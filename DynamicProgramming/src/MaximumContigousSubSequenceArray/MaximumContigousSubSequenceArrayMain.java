package MaximumContigousSubSequenceArray;

import java.util.Arrays;

public class MaximumContigousSubSequenceArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a={-2,-3,4,-1,-2,1,5,-3};
		int[] maxSum= new int[a.length+1];
		maxSum[0]=0;
		for(int i=0;i<a.length;i++)
		{
			maxSum[i+1]=Math.max(maxSum[i]+a[i], a[i]);
		}
		System.out.println(Arrays.toString(maxSum));
	}

}
