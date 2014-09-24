package com.designPatterns.compositePattern.component;

/**
 * The {@link IEquipmentComponent}.
 * <p>
 * This interface represents the component structure of
 * the Composite Pattern. Here we define the common interface
 * that will be shared between the leaves and the composite.
 * <p> 
 * Both the leaves and composite will implement this interface.
 * 
 * @author szeyick
 */
public interface IEquipmentComponent {

	/**
	 * @return - the name of the component.
	 */
	String getComponentName();
	
	/**
	 * @return - the price of the component.
	 */
	float getPrice();
}
