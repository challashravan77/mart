package P1;

import java.util.Scanner;

public class Provider
{
	static Market market = new Market();
	static MarketService marketService = new MarketService();
	static double budget=50000;
	static double fp;
	static double tv=15000;
	static double ac=18000;
	static Scanner sc = new Scanner(System.in);
	public static void add()
	{
		System.out.println("Select \n1.Electronics\n2.Clothes\n3.Kitchen");
		int s = sc.nextInt();
		if(s==1)
		{
			electronics();
		}
		else if(s==2)
		{
			
		}
	}
	public static void displayItems()
	{
		marketService.displayItems();
	}
	
	public static void updateItems()
	{
		displayItems();
		System.out.println("Enter the id to update");
		int i = sc.nextInt();
		System.out.println("Enter no of qualitiues");
		market.setQuantity(sc.nextInt());
		market.setId(i);
		marketService.updateItems(market);
	}
	public static void deleteItems()
	{
		displayItems();
		System.out.println("Enter the id to delete");
		int i = sc.nextInt();
		market.setId(i);
		marketService.deleteItems(market);
	}
	private static void electronics()
	{
		System.out.println("Selecy \n1.TV\n2.AC");
		int s = sc.nextInt();
		String s1 = "TV";
		String s2="AC";
		if(s==1)
		{
			System.out.println("You are selected :"+s1);
			System.out.println("Enter the no of quantities :");
			int q = sc.nextInt();
			fp=q*tv;
			budget=budget-fp;
			market.setProduct(s1);
			market.setPrice(fp);
			market.setQuantity(q);
			marketService.addItems(market);
			
		}
		else if(s==2)
		{
			
		}
		else
		{
			System.out.println("invalid selection");
			electronics();
		}
	}
	public static void main(String[] args)
	{
		add();
		//deleteItems();
	}

}
