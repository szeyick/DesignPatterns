package com.designPatterns.compositePattern;

import com.designPatterns.compositePattern.composite.ComputerCase;
import com.designPatterns.compositePattern.composite.Motherboard;
import com.designPatterns.compositePattern.leaves.FloppyDisk;
import com.designPatterns.compositePattern.leaves.HardDrive;
import com.designPatterns.compositePattern.leaves.Memory;

/**
 * The {@link CompositePattern}.
 * <p>
 * This class contains a program runnable that
 * demonstrates the basic functionality of the
 * composite design pattern. 
 * <p>
 * The example used here is the building of a computer
 * composite from individual computer parts (leaves).
 * <p> 
 * @author szeyick
 */
public class CompositePattern {

	/**
	 * The program main.
	 * @param args - command line arguments.
	 */
	public static void main(String[] args) {
		buildComputer();
	}
	
	/**
	 * Create the leaves to build the motherboard component.
	 */
	private static Motherboard buildMotherboard() {
		HardDrive primaryDrive = new HardDrive("Primary Drive", 150);
		HardDrive secondaryDrive = new HardDrive("Secondary Drive", 100);
		
		Memory memory = new Memory("Memory Module", 50);
		Motherboard motherboard = new Motherboard("Motherboard", 300);
		
		motherboard.addComponent(primaryDrive);
		motherboard.addComponent(secondaryDrive);
		motherboard.addComponent(memory);
		
		return motherboard;
	}
	
	/**
	 * Place all the parts inside the computer case and 
	 * display the price.
	 */
	private static void buildComputer() {
		ComputerCase computerCase = new ComputerCase("Computer Case", 200);
		FloppyDisk diskDrive1 = new FloppyDisk("Floppy Drive 1", 5);
		
		Motherboard motherboard = buildMotherboard();
		computerCase.addComponent(diskDrive1);
		computerCase.addComponent(motherboard);
		
		System.out.println("Total Price of Motherboard: " + motherboard.getPrice());
		System.out.println("Total Price of Computer: " + computerCase.getPrice());
	}
}
