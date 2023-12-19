public class break1
{
public static void main (String args[])
{
int x;
for(x=1;x<=10;x=x+2)
{
if(x==9)
break;
System .out.println(x);
}
System.out.println("outside the loop  "+x);
}
}