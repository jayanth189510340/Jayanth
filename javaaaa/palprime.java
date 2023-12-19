public class palprime
{
public static void main(String args[])
{
int num=11,rev=0,rem=0,count=0,temp=num;
for(num=11;num>0;num=num/10)
{
rem=num%10;
rev=(rev*10)+rem;
for(int x=2;x<=num/2;x++)
if(num%x==0)
{
count++;
break;
}
}
if(rev==temp&&count==0)
{
System.out.println("palprime");
}
else
System.out.println("not a palprime");
}
}
