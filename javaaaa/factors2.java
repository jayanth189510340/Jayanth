public class factors2
{
public static void main(String args[])
{
int start=1,count=0;
while(start<=10)
{
if(start%2==0)
{
System.out.println(start);
count++;
}
start++;
}
System.out.println(count);
}
}