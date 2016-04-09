package longestSubsequencePalindrome;

public class longestSubsequencePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="GEEKS FOR GEEKS";
		int length=s.length();
		char[] c;
		c=s.toCharArray();
		System.out.println(longestSubSequencePalindrome(c,0,length-1));
		
	}
	public static int longestSubSequencePalindrome(char[] c,int start, int end)
	{
		if(c[start]==c[end] && start==end)
		{
			return 1;
		}
		else if(end==start+1 && c[start]!=c[end])
		{
			return 1;
		}
		else if(end==start+1 && c[start]==c[end])
		{
			return 2;
		}
		else if(c[start]==c[end])
		{
			return 2+longestSubSequencePalindrome(c,start+1,end-1);
		}
		else
		{
			return Math.max(longestSubSequencePalindrome(c,start+1,end),longestSubSequencePalindrome(c,start,end-1));
		}
	}

}
