import java.util.HashMap;
import java.util.Scanner;

public class QueuePractice {

	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		
		//Restaurant 1 : Diner
		
		HashMap<String, Double> menu = new HashMap<String, Double>();
		
		menu.put("Scrambled Eggs" , 5.99);
		menu.put("French Toast", 3.50);
		menu.put("Apple Juice" , 1.99);
		menu.put("Pancakes", 3.45);
		
		
		
		Table t1 = new Table(3);
		Table t2 = new Table(3);
		Table t3 = new Table(4);
		Table t4 = new Table(4);
		Table t5 = new Table(4);
		Table t6 = new Table(6);
		Table t7 = new Table(10);
		Table t8 = new Table(2);
		Table t9 = new Table(2);
		
		Table[] tables = {t1, t2, t3, t4, t5, t6, t7, t8, t9};
		
		Restaurant diner = new Restaurant(tables, menu);
		
		Customer boyfriend = new Customer("Matthew", menu);
		Customer girlfriend = new Customer("Fiona", menu );
		Customer[] customers1 = {boyfriend, girlfriend};
		
		Group g1 = new Group("Matthew and Fiona", 2, customers1);
		
		Customer c1 = new Customer("Joel", menu); 
		Customer c2 = new Customer("Lynn", menu);
		Customer[] customers2 = {c1, c2};
		
		Group g2 = new Group("Joel and Lynn", 2, customers2);
		
		diner.addGroup(g1);
		diner.addGroup(g2);
		
		Customer c3 = new Customer("Robert", menu);
		Customer c4 = new Customer("Its a good day to have a great day!", menu);
		Customer[] customers3 = {c3, c4};
		
		Group g3 = new Group("Wake", 2, customers3);
		
		diner.addGroup(g3);
		
		scan.nextLine();
		
		g1.getOrders();
		
		diner.emptyTable(g1);
		
		System.out.println("Current revenue: " + diner.getRevenue());
		
		g2.getOrders();
		
		diner.emptyTable(g2);	
		
	}
	
}
