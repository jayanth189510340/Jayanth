package jayanth;
import java.util.Scanner;
public class decathlon1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
						int total=0,quantity=0;
						String decision;
						int cricketkit=7000,football=1000,batmintonkit=6500,skateboard=5000;
						System.out.println("WELCOME TO DECALTHON");
						while(true)
						{
							System.out.println("CHOOSE ITEM");
							System.out.println("cricketkit\tfootball\tbatmintonkit\tskateboard\t");
							String item=s.next();
							if(item.equals("cricketkit"))
							{
								System.out.println("HOW MANY DO YOU WANT");
								quantity=s.nextInt();
								if(quantity>6)
								{
									System.out.println("OUT OF STOCK CHOOSE LESS THAN 6");
								}
								else
								{
									int price=quantity*cricketkit;
									total=total+price;
								}
					                   }
								else if(item.equals("football"))
								{
									System.out.println("HOW MANY DO YOU WANT");
									quantity=s.nextInt();
									if(quantity>5)
									{
										System.out.println("OUT OF STOCK CHOOSE LESS THAN 5");
									}
									else
									{
										int price=quantity*football;
										total=total+price;
									}
					                             }
									else if(item.equals("batmintonkit"))
									{
									 	System.out.println("HOW MANY DO YOU WANT");
										quantity=s.nextInt();
										if(quantity>4)
										{
											System.out.println("OUT OF STOCK CHOOSE LESS THAN 4");
										}
										else
										{
											int price=quantity*batmintonkit;
											total=total+price;
										}
					                                }
										else if(item.equals("skateboard"))
										{
											System.out.println("HOW MANY DO YOU WANT");
											quantity=s.nextInt();
											if(quantity>6)
											{
												System.out.println("OUT OF STOCK CHOOSE LESS THAN 6");
											}
											else
											{
												int price=quantity*skateboard;
												total=total+price;
											}
					                                     }
					                             
							          		else 
										{
											System.out.println("NOT AVAILABLE");
											
										}
					                          
										System.out.println("DO YOU WANT TO CONTINUE");
										decision=s.next();
										if(decision.equals("no"))
										{
											System.out.println("YOUR TOTAL BILL IS "+total);
											break;
										}
											
			}
	}
}
