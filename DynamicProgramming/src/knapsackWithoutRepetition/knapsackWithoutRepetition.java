package knapsackWithoutRepetition;

public class knapsackWithoutRepetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weight={1,2,5,6,7};
		int[] value={1,6,18,22,28};
		int maxWeight=11;
		int[][] optValue=new int[weight.length+1][maxWeight+1];
		int i,j;
		for(i=0;i<=weight.length;i++)
		{
			for(j=0;j<=maxWeight;j++)
			{
				if(i==0 || j==0)
				{
					optValue[i][j]=0;
				}
				else if(weight[i-1]>j)
				{
					optValue[i][j]=optValue[i-1][j];
				}
				else 
				{
					optValue[i][j]=Math.max(optValue[i-1][j], value[i-1]+optValue[i-1][j-weight[i-1]]);
				}
			}
		}
		System.out.println(optValue[weight.length][maxWeight]);
	}

}
