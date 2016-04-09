package knapsack3DWithoutRepetition;


public class knapsack3DWithoutRepetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weight={1,2,5,6,7};
		int[] value={1,6,18,22,28};
		int[] volume={1,10,3,2,2};
		int maxWeight=11,maxVolume=15;
		
		int[][][] optValue=new int[weight.length+1][maxWeight+1][maxVolume+1];
		int i,j,k;
		for(i=0;i<=weight.length;i++)
		{
			for(j=0;j<=maxWeight;j++)
			{
				for(k=0;k<=maxVolume;k++)
				{
					if(i==0 || j==0 || k==0)
					{
						optValue[i][j][k]=0;
					}
					else if(weight[i-1]>j || volume[i-1]>k)
					{
						optValue[i][j][k]=optValue[i-1][j][k];
					}
					else 
					{
						optValue[i][j][k]=Math.max(optValue[i-1][j][k], value[i-1]+optValue[i-1][j-weight[i-1]][k-volume[i-1]]);
					}
				}
			}
		}
		System.out.println(optValue[weight.length][maxWeight][maxVolume]);
	}

}

