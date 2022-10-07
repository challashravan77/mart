package P1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MarketService implements MarketDAO
{

	public void addItems(Market market)
	{
		try
		{
			Connection connection = Connectionfactory.getConnection();
			Statement statement = connection.createStatement();
			int i=statement.executeUpdate("insert into market(`product`,`quantity`,`price`) values('"+market.getProduct()+"','"+market.getQuantity()+"','"+market.getPrice()+"')");
			if(i>0)
			{
				System.out.println("Data Inserted");
			}
			
		} 
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

	@Override
	public void deleteItems(Market market)
	{
		try
		{
			Connection connection = Connectionfactory.getConnection();
			Statement statement = connection.createStatement();
			int i=statement.executeUpdate(" delete from market where id='"+market.getId()+"' ");
			if(i>0)
			{
				System.out.println("Data deleted");
			}
			
		} 
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

	@Override
	public void displayItems()
	{
		try
		{
			Connection connection = Connectionfactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from market");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			}
			
		} 
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

	@Override
	public void updateItems(Market market)
	{
		try
		{
			Connection connection = Connectionfactory.getConnection();
			Statement statement = connection.createStatement();
			int i=statement.executeUpdate(" Update market set quantity='"+market.getQuantity()+"' where id='"+market.getId()+"' ");
			if(i>0)
			{
				System.out.println("Data Updated");
			}
			
		} 
		catch (Exception e)
		{
			// TODO: handle exception
		}
		
	}

}
