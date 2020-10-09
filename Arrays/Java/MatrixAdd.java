import java.util.Scanner;
 
class MatrixAdd
{
public static void main(String args[])
{
int row, col,i,j;
Scanner in = new Scanner(System.in);
//Taking Input of rows and Column 
System.out.println("Enter the number of rows");
row = in.nextInt();
 
System.out.println("Enter the number columns");
col = in.nextInt();
 
int mat1[][] = new int[row][col];
int mat2[][] = new int[row][col];
int res[][] = new int[row][col];
 
System.out.println("Enter the elements of matrix1");
 
for ( i= 0 ; i < row ; i++ )
{ 
 
for ( j= 0 ; j < col ;j++ )
mat1[i][j] = in.nextInt();
 
System.out.println();
}
System.out.println("Enter the elements of matrix2");
 
for ( i= 0 ; i < row ; i++ )
{
 
for ( j= 0 ; j < col ;j++ )
mat2[i][j] = in.nextInt();
 
System.out.println();
}

// Logic to add matrix 
for ( i= 0 ; i < row ; i++ )
for ( j= 0 ; j < col ;j++ )
res[i][j] = mat1[i][j] + mat2[i][j] ; 
 
System.out.println("Sum of matrices:-");
 
// Display The Matrix  
for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < col ;j++ )
System.out.print(res[i][j]+"\t");
 
System.out.println();
}
 
}
}