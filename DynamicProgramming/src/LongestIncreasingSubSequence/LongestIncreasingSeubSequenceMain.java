package LongestIncreasingSubSequence;

import java.util.Arrays;

public class LongestIncreasingSeubSequenceMain {
	
	public static void main(String [] args)
	{
		int [] a={10,22,9,33,21,50,41,60,80};
		int [] finalCount= new int[a.length];
		finalCount[0]=1;
		int result;
		for(int i=1;i<a.length;i++)
		{
			result=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]>a[j])
				{
					result=Math.max(result,1+finalCount[j]);
				}
			}
			finalCount[i]=result;
		}
		System.out.println(Arrays.toString(finalCount));
		
	}
	
}
