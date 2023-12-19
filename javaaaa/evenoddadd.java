public class evenoddadd
{
public static void main(String args[])
{
int num=1754,sum1=1,sum2=2;
for(;num>0;num=num/10)
{
int rem=num%10;
if(rem%2==0)
{
System.out.print(rem+sum2);
}
else
System.out.print(rem+sum1);
}
}
}