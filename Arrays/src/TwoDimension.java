
public class TwoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a2 = new int[10][5];
		for(int i=0;i<a2.length;i++)
		{
			for(int j=0;j<a2[i].length;j++)
			{
				a2[i][j]=i;
				System.out.println(""+a2[i][j]);
			}
			System.out.println("");
		}
	}

}
