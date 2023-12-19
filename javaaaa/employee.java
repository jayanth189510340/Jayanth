public class MyClass
   {
    public static void main(String args[])  
   {
      System.out.println("Employee details");
      System.out.println("     ");
      String employee_name="jayanth";
      int employee_id=100;
      String role="developer";
      String department="developement";
      int totaldays=30;
      int ewd=25;
      int ead=5;
      int eds=500;
      int eas=totaldays*eds;
      int ems=ewd*eds;
      System.out.println("Employee_name="+employee_name);
      System.out.println("     ");
      System.out.println("Employee_id="+employee_id);
      System.out.println("     ");
      System.out.println("Employee_role="+role); 
      System.out.println("     ");
      System.out.println("Employee_department="+department);
      System.out.println("     ");
      System.out.println("Total_number_of_working_days="+totaldays); 
      System.out.println("     ");
      System.out.println("Employee_working_days="+ewd);
      System.out.println("     ");
      System.out.println("Employee_absent_days="+ead);
      System.out.println("     ");
      System.out.println("Employee_day_wise_salary="+eds);
      System.out.println("     ");
      System.out.println("Employee_actual_salary="+eas);
      System.out.println("     ");
      System.out.println("Employee_salary_of_the_month="+ems);
    }
}