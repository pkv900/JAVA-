
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		int mat1[][]= {{2,2,2},{2,2,2},{2,2,2}};
		int mat2[][]= {{2,2,2},{2,2,2},{2,2,2}};
		
		System.out.println("Operation on Matrices \n1.Addition");
		int sum[][]=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				sum[i][j]=mat1[i][j]+mat2[i][j];
				System.out.print("\t"+sum[i][j]);
			}
			System.out.println("\t");
		}
		

		System.out.println("2.Subtraction");
		int diff[][]=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				sum[i][j]=mat1[i][j]-mat2[i][j];
				System.out.print("\t"+diff[i][j]);
			}
			System.out.println("\t");
		}

		System.out.println("3.Transpose");
		int trans[][]=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				sum[i][j]=mat1[0][0]=mat2[0][0];
				System.out.print("\t"+trans[0][0]);
			}
			System.out.println("\t");
		}
		
		System.out.println("4.Multiplication");
		int prod[][]=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				prod[i][j]=0;
				{
					for(k=0;k<3;k++)
						prod[i][j]=prod[i][j]+mat1[i][k]*mat2[k][i];
				}
				System.out.print("\t"+prod[i][j]);
			}
			System.out.println("\t");
		}
		
		
	}

}
