public class continue1
{
public static void main(String args[])
{
int x;
for(x=1;x<=10;x=x+2)
{
if(x==7)
continue;
System.out.println(x);
}
System.out.println("outside the loop "+x);
}
}
