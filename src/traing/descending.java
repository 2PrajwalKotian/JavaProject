package traing;

public class descending {

	public static void main(String[] args) {
		int value[]={1,4,8,3,6,9};
		int temp;
		for(int i=0;i<value.length;i++)
		{
			for(int j=i+1;j<value.length;j++)
			{
				if(value[i]<value[j])
				{
		            temp =  value[i];
		            value[i] = value[j];
		            value[j] = temp;
				}
			}
		}
		System.out.println("descending order arrat :");
		for(int i=0;i<5;i++)
		{
			System.out.println(value[i]);
		}
		

	}

}
