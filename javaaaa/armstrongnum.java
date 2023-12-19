public class armstrongnum 
{
public static void main(String args[])
{
int num=54748,temp=num,rem,sum=0,pow=0;
while(num>0)
{
rem=num%10;
//pow=rem*rem*rem;
pow=(int)Math.pow(rem,5);
sum=sum+pow;
num=num/10;
}
System.out.println(sum);
if(sum==temp)
{
System.out.println("Armstrong number");
}
else
System.out.println("not an armstrong number");
}
}
//0to9,153,370,371,407,1634,8208,9474,54748