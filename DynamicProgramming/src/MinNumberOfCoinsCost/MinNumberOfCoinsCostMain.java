package MinNumberOfCoinsCost;

import java.util.Arrays;

public class MinNumberOfCoinsCostMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] denominations={9,6,5,1};
		int maxValue=11;
		int[] minCoins= new int[maxValue+1];
		minCoins[0]=0;
		int i,k,result;
		for(i=1;i<=maxValue;i++)
		{
			result=Integer.MAX_VALUE;
			for(k=0;k<denominations.length;k++)
			{
				if(denominations[k]<=i)
				{
					result=Math.min(result,1+minCoins[i-(denominations[k])]);
				}
			}
			minCoins[i]=result;
		}
		System.out.println(Arrays.toString(minCoins));
	}

}
