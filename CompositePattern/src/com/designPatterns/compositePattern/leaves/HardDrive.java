package com.designPatterns.compositePattern.leaves;

import com.designPatterns.compositePattern.component.IEquipmentComponent;

/**
 * The {@link HardDrive}.
 * <p>
 * This class represents the leaf component. It is an 
 * individual part of the composite pattern and is
 * an individual part of the computer.
 * 
 * @author szeyick
 */
public class HardDrive implements IEquipmentComponent {

	/**
	 * The name of this instance of the component.
	 */
	private String componentName;
	
	/**
	 * The price of this instance of the component.
	 */
	private float price;
	
	/**
	 * Constructor.
	 * @param componentNameTmp - The name of the component.
	 * @param priceTmp - The price of the component.
	 */
	public HardDrive(String componentNameTmp, float priceTmp) {
		componentName = componentNameTmp;
		price = priceTmp;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getComponentName() {
		return componentName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public float getPrice() {
		return price;
	}
}
