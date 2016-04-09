package longestCommonSubsequence2Strings;

public class longestCommonSubsequence2StringsMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1="forgeeksskeegfor";//ABCDGH
		String s2="rofgeeksskeegrof";//AEDFHR
		char[]c1;
		char[] c2;
		c1=s1.toCharArray();
		c2=s2.toCharArray();
		int endc1=c1.length;
		int endc2=c2.length;
	
		System.out.println(longestCommonSubsequence2Strings(c1,c2,endc1,endc2));
	}

	public static int longestCommonSubsequence2Strings(char[] c1,char[] c2,int endc1,int endc2)
	{
		if(endc1==0 || endc2==0)
		{
			return 0;
		}
		else if(c1[endc1-1]==c2[endc2-1])
		{
			//System.out.println(c1[endc1-1]);
			return 1+longestCommonSubsequence2Strings(c1,c2,endc1-1,endc2-1);
		}
		else
		{
			return Math.max(longestCommonSubsequence2Strings(c1,c2,endc1,endc2-1), longestCommonSubsequence2Strings(c1,c2,endc1-1,endc2));
		}
	}
}
