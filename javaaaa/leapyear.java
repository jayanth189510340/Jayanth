public class leapyear {
    public static void main(String args[]) {
      int x;
      for(x=1;x<=2023;x++)
      { 
          if(x%4==0&&x%100!=0||x%400==0)
          System.out.println(x);
      }
    }
}