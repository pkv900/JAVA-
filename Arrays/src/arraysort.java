
public class arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int n[] = {4,1,2,5,3};
		for(int i =0;i<n.length-1;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]>n[j])
				{
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
					
				}
			}
		}
		for(int i=0;i<n.length;i++)
			System.out.println(n[i]);

	}

}
