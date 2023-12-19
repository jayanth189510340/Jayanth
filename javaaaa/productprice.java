public class MyClass {
    public static void main(String args[]) {
     String pn="laptop";
     String pb="dell";
     String pc="123jjj";
     int pp=15000;
     int pq=3;
     int pt=pp*pq;
     {  
         System.out.println("product_name="+pn);
         System.out.println("product_brand="+pb);
         System.out.println("product_code="+pc);
         System.out.println("product_Actual_price="+pt);
     }
     if(pt>80000)
         {
         System.out.println("Ammount to be paid="+(pt-(pt*50/100)));
         }
         else if(pt>60000)
         { 
             System.out.println("Amount to be paid="+pt*30/100);
     }
     else if(pt>40000)
     {
     System.out.println("Amount to be paid="+pt*10/100);
    }
        else
        {
            System.out.println("No_discount");
        }
    }
}