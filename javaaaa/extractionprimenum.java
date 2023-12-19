public class extarctionprimenum
{
public static void main(String args[])
{
int num=1756;count=0;
while(num>0)
{
count=0;
int rem=num%10;
for(int start=1;start<=num;start++)
{ 
if(rem%start==0)
count++;
if(count==2)
{
System.out.println(rem);
}
}
num/=10;
}
}
}

