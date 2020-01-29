import java.util.*;
import java.lang.Math;

private class Objects
{
  private float x;
  private float y;

  public Objects (float x, float y)
  {
    this.x = x;
    this.y = y;
  }

  public void move(float dx, float dy)
  {
    x += dx;
    y += dy;
  }

  String toString()
  {
    return "["+ x +","+ y +"]";
  }
 public static void main(String[] args)
 {
    Objects p = new Objects ( 1, 2);
    System.out.println(p);
  }


}
