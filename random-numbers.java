import java.util.*;

public class Main{
  public static void main(String[] args) {
    
    int i;
    Random rnum = new Random();
    /* Below code would generate 10 random numbers
    * between 0 and 100.
    */
    System.out.println("Random Numbers:");
    
    for(i=1; i<=10; i++) {
      System.out.println(rnum.nextInt(100));
    }
      
  }
}
