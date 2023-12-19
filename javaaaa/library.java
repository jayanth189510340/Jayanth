public class library
{
public static void main(String args[]){
System.out.println("Library application");
String book_name_department="java basics cse";
int book_price=2000;
int date_issued_of_book=12;
int book_returned=24;
int no_of_days=book_returned-date_issued_of_book;
System.out.println("Book name and department="+book_name_department);
System.out.println("book_price="+book_price);
if(no_of_days>30)
{
System.out.println("Fine amount="+book_price);
}
else if(no_of_days>10)
{
System.out.println("Fine amount="+(no_of_days-3)*100);
}
else if(no_of_days>3)
{
System.out.println("Fine amount="+(no_of_days-3)*10);
}
else
{
System.out.println("No fine");
}
}
}