public class emp
{
public static void main (String args[])
{
String name="jayanth";
int salary_basic=82500;
int dearness_allowances=salary_basic*40/100;
int rental_allowances=salary_basic*20/100;
System.out.println("name of the employee="+name);
System.out.println("basic salary="+salary_basic);
System.out.println("dearness allowances="+dearness_allowances);
System.out.println("rental allowances="+rental_allowances);
System.out.println("gross salary="+(salary_basic+dearness_allowances+rental_allowances));
}
}
