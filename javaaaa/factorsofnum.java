public class factorsofnum {
    public static void main(String args[])
    {
        int num=52,start=1,count=0;
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
       if(count==4)
            System.out.println("super number");
      else
       System.out.println("not a super number");
    }
    
}