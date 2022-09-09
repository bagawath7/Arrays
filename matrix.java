import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int row=sc.nextInt();
        System.out.println("enter the no of column");
        int column=sc.nextInt();
        int array[][]=new int [row][column];
        System.out.println("enter the no of rows");
        int row2=sc.nextInt();
        System.out.println("enter the no of column");
        int column2=sc.nextInt();
        int array2[][]=new int [row2][column2];
        int result[][]=new int [row][column2];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<column2;j++)
            {
                array2[i][j]=sc.nextInt();
            }
        }
        System.out.println("multiplication");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column2;j++)
            {
                for(int k=0;k<column;k++)
                {
                    result[i][j]+=array[i][k]*array2[k][i];
                }
                System.out.print(result[i][j]+" ");
            }
        }

    }

}
