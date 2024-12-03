package com.vamshi.designpatterns;

class Computer
{
	private int ram;
	private String processor;
	private String graphics;
	private String chip;
	
	public Computer()
	{
	}
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getGraphics() {
		return graphics;
	}
	public void setGraphics(String graphics) {
		this.graphics = graphics;
	}
	public String getChip() {
		return chip;
	}
	public void setChip(String chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", processor=" + processor + ", graphics=" + graphics + ", chip=" + chip + "]";
	}
	
}

interface ComputerBuilder
{
	public ComputerBuilder buildRam(int ram);
	public ComputerBuilder buildProcessor(String processor);
	public ComputerBuilder buildGraphics(String Graphics);
	public ComputerBuilder buildChip(String Chip);
	public Computer build();
}

class DesktopComputerBuilder implements ComputerBuilder
{
	Computer computer = new Computer();
	
	public DesktopComputerBuilder(Computer computer)
	{
		this.computer = computer;
	}

	@Override
	public ComputerBuilder buildRam(int ram) {
		computer.setRam(ram);
		return this;
	}

	@Override
	public ComputerBuilder buildProcessor(String processor) {
		// TODO Auto-generated method stub
		computer.setProcessor(processor);
		return this;
	}

	@Override
	public ComputerBuilder buildGraphics(String graphics) {
		computer.setGraphics(graphics);
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public ComputerBuilder buildChip(String chip) {
		// TODO Auto-generated method stub
		computer.setChip(chip);
		return this;
	}
	public Computer build()
	{
		return computer;
	}
}

public class BuilderClass {

	public static void main(String[] args) {

		Computer computer = new Computer();
		ComputerBuilder builder = new DesktopComputerBuilder(computer);
		builder.buildRam(2)
				.buildGraphics("AMD")
				.buildProcessor("12K")
				.buildChip("Intel")
				.buildRam(1)
				.build();				
		System.out.println(computer);
	}

}
