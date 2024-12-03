package com.vamshi.designpatterns;

interface TextBox
{
	void getTextBox();
}
interface Button
{
	void getButton();
}
interface GUIFactory
{
	TextBox createTextBox();
	Button createButton();
}

class DarkTextBox implements TextBox
{
	public void getTextBox() {
		System.out.println("Dark Text Box");
	}
}
class LightTextBox implements TextBox
{
	public void getTextBox()
	{
		System.out.println("Light text Box");
	}
}
class DarkButton implements Button
{
	public void getButton() {
		System.out.println("Dark Button");
	}
}
class LightButton implements Button
{
	public void getButton() {
		System.out.println("Light Button");
	}
}

class DarkGUIFactory implements GUIFactory
{
	public Button createButton()
	{
		return new DarkButton();
	}
	public TextBox createTextBox()
	{
		return new DarkTextBox();
	}
}
class LightGUIFactory implements GUIFactory
{
	public Button createButton()
	{
		return new LightButton();
	}
	public TextBox createTextBox()
	{
		return new LightTextBox();
	}
}

public class AbstractFactoryClass {

	public static void main(String[] args) {
		
		GUIFactory lightFactory = new LightGUIFactory();
		lightFactory.createButton().getButton();
		lightFactory.createTextBox().getTextBox();;
		
		GUIFactory darkFactory = new DarkGUIFactory();
		darkFactory.createButton().getButton();
		darkFactory.createTextBox().getTextBox();;
		
	}

}
