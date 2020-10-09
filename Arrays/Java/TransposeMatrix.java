import java.util.Scanner;
 
class TransposeMatrix
{
public static void main(String args[])
{
int row, col,i,j;
Scanner in = new Scanner(System.in);
//Taking Input of rows and Columns 
System.out.println("Enter the number of rows");
row = in.nextInt();
 
System.out.println("Enter the number columns");
col = in.nextInt();
 
int mat1[][] = new int[row][col];
 
System.out.println("Enter the elements of matrix");
 
for ( i= 0 ; i < row ; i++ )
{ 
 
for ( j= 0 ; j < col ;j++ )
mat1[i][j] = in.nextInt();
 
System.out.println();
}

System.out.println("Printing Matrix Before Transpose:");  
for(i=0;i<row;i++)
{    
	for(j=0;j<col;j++)
		{    
			System.out.print(mat1[i][j]+" ");    
		}    
	System.out.println();//new line 
}



System.out.println("Printing Matrix After Transpose:");  
for(i=0;i<col;i++)
{    
	for(j=0;j<row;j++)
		{    
			System.out.print(mat1[j][i]+" ");    
		}    
	System.out.println();//new line 
}


 
}
}