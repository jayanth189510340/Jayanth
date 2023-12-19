public class rprimenumber
{
public static void main(String args[])
{
int num=7,start=11,count=0,sum=0;
while(start>=1)
{
if(num%start==0)
{
System.out.println(start);
sum=sum+start;
count++;
}
start--;
}
if(count==2)
System.out.println("prime number");
else
System.out.println("not a prime number");
}
}


