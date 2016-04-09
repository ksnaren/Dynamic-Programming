package CuttingRodMaxCost;
import java.util.*;

public class cuttingRodMaxCostMain 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] cost={0,1,5,8,9,10,17,17,20};
		int[] finalValue={0,0,0,0,0,0,0,0,0};
		int i,k,result;
		for(i=1;i<=cost.length-1;i++)
		{
			result=0;
			for(k=1;k<=i;k++)
			{
				if(cost[k]+finalValue[i-k]>result)
					{
						result=cost[k]+finalValue[i-k];
					}
			}
			finalValue[i]=result;
		}
		System.out.println(Arrays.toString(finalValue));
	}
}
