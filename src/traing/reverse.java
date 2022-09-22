package traing;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "hello";
		String str2 = "";
		int len=str1.length();
		for(int i=len-1;i>=0;i--)
		{
			str2 = str2+str1.charAt(i);
		}
		System.out.println(str2);

	}

}
