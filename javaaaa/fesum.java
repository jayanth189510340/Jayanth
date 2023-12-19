public class fesum
{
public static void main(String args[])
{
int num=1235,sum=0,temp=num;
for(num=1235;num>0;num/=10)
{
int rem=num%10;
sum=sum+rem;
}
System.out.println("sum of digits of "+temp+" "+sum);
}
}