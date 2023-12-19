public class palindrome
{
public static void main(String args[])
{
int rem,rev=0,temp;
int num=121;
temp=num;
while(num>0)
{
rem=num%10;
rev=(rev*10)+rem;
num=num/10;
}
if(rev==temp)
{
System.out.println(temp+" is a  palindrome ");
}
else
System.out.println(temp+" is not a palindrome ");
}
}