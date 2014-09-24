package com.designPatterns.compositePattern.leaves;

import com.designPatterns.compositePattern.component.IEquipmentComponent;

/**
 * The {@link GraphicsCard}.
 * <p>
 * This class represents a leaf component. It is an 
 * individual part of the composite pattern and is
 * an individual part of the computer.
 * <p>
 * @author szeyick
 */
public class GraphicsCard implements IEquipmentComponent {

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
	 * @param componentNameTmp - The name to assign to this component.
	 * @param priceTmp - The price to assign to this component.
	 */
	public GraphicsCard (String componentNameTmp, float priceTmp) {
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
