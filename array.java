import java.util.*;
public class array
{
  public static void main(String[] args)
  {
    String[] names={"tim","bob","jeff"};
    for(int i=0;i<3;i++)
    {
      System.out.println(names[i]);
    }
    System.out.println("\n");
    int[][] a = new int [10][10];
    for(int i=0;i<10;i++)
      {
        for(int j=0;j<10;j++)
        {
          a[i][j]=j;
        }
      }
      for(int i=0;i<10;i++)
        {
          for(int j=0;j<10;j++)
          {
            System.out.print(a[i][j]);
          }
          System.out.println("\n");
        }
  }

}
