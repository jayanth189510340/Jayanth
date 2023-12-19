public class primenumber {
    public static void main(String args[])
    {
        int num=7,start=1,count=0;
       System.out.println("factors of "+num+" are ");
        while(start<=num)
        {
            if(num%start==0)
            {
                System.out.println(start);
                count++;
            }
            start++;
        }
        System.out.println("number of factors of "+num+" are "+count);
       if(count==2)
            System.out.println("prime number");
      else
       System.out.println("not a prime number");
    }
    
}