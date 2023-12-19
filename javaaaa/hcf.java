public class hcf
{
public static void main(String args[])
{
int num1=15,num2=36,x=1,hcf=0;
while(x<=num1&&x<=num2)
{
if(num1%x==0&&num2%x==0)
{
hcf=x;
}
x++;
}
System.out.println("hcf of "+num1+"and"+num2+ "=" +hcf);
}
}


