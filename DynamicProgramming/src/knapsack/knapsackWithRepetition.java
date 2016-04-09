package knapsack;

import java.util.Arrays;

public class knapsackWithRepetition {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] itemWeight={6,3,4,2};
		int[] itemValue={30,14,16,9};
		int maxWeight=10,result;
		int[] optWeightValue=new int[maxWeight+1];
		int[] itemsConsidered=new int[maxWeight+1];
		optWeightValue[0]=0;
		for(int i=1;i<=maxWeight;i++)
		{
			result=0;
			for(int j=0;j<itemWeight.length;j++)
			{
				if(i>=itemWeight[j])
				{
					result=Math.max(result,itemValue[j]+optWeightValue[i-itemWeight[j]]);
				}
			}
			optWeightValue[i]=result;
		}
		System.out.println(Arrays.toString(optWeightValue));
		
	}
}
