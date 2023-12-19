public class grades {
    public static void main(String args[])
    {
      System.out.println("Student application");
      String studentname="koushik";
      int studentage=22;
      char sec='b';
      String gender="male";
      int s1=99,s2=98,s3=95,s4=90;
      int total=s1+s2+s3+s4;
      System.out.println("Student name="+studentname);
      System.out.println("section="+sec);
      System.out.println("Age="+studentage);
      System.out.println("Gender="+gender);
      System.out.println("Total marks="+total);
      if(total>=380)
      {
      System.out.println("Grade=A");
      }
      else if(total>=300)
      {
      System.out.println("Grade=B");
      }
      else if(total>=250)
     {
         System.out.println("Grade=C");
     }
     else if(total>=200) 
     {
         System.out.println("Grade=d");
     }
     else
     {
      System.out.println("fail");
     }
    }
}