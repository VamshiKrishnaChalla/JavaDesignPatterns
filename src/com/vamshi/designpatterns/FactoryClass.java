package com.vamshi.designpatterns;

interface Drink
{
	public void drink();
}

class Tea implements Drink
{
	public void drink()
	{
		System.out.println("TEA");
	}
}
class Coffee implements Drink
{
	public void drink()
	{
		System.out.println("COFFEE");
	}
}
class DrinkFactory
{
	Drink getDrink(String drinkType) 
	{
		if(drinkType.equalsIgnoreCase("TEA"))
		{
			return new Tea();
		}
		else if(drinkType.equalsIgnoreCase("COFFEE"))
		{
			return new Coffee();
		}
		else
		{
			return null;
		}
	}
}
public class FactoryClass {

	public static void main(String[] args) {
		
		try {
			DrinkFactory drinkFactory = new DrinkFactory();  
			Drink tea = drinkFactory.getDrink("Coffee");
			tea.drink();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
