package com.designPatterns.compositePattern.composite;

import java.util.ArrayList;
import java.util.List;

import com.designPatterns.compositePattern.component.IEquipmentComponent;

/**
 * The {@link Motherboard}.
 * <p>
 * This class represents the composite structure in the
 * Composite Pattern. In here, we implement the same
 * interface as an individual component, however we can
 * perform further operations that include the components
 * that it contains.
 * <p>
 * @author szeyick
 */
public class Motherboard implements IEquipmentComponent {

	/**
	 * The name of this instance of the component.
	 */
	private String componentName;
	
	/**
	 * A {@link List} of components that this class contains.
	 */
	private List<IEquipmentComponent> motherboardComponents;
	
	/**
	 * The price of the composite.
	 */
	private float price;
	
	/**
	 * Constructor.
	 * @param componentNameTmp - The name to assign to this component.
	 * @param priceTmp - The price to assign to this component.
	 */
	public Motherboard (String componentNameTmp, float priceTmp) {
		componentName = componentNameTmp;
		motherboardComponents = new ArrayList<IEquipmentComponent>();
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
		float totalPrice = 0;
		// Return the total of the composite.
		for(IEquipmentComponent components: motherboardComponents) {
			totalPrice += components.getPrice();
		}
		return totalPrice + price;
	}
	
	/**
	 * @param component - The component to add to this composite.
	 * We have the flexibility to add additional composites to the 
	 * component.
	 */
	public void addComponent(IEquipmentComponent component) {
		motherboardComponents.add(component);
	}
	
	/**
	 * @param component - The component to remove from this composite.
	 */
	public void removeComponent(IEquipmentComponent component) {
		motherboardComponents.remove(component);
	}

}
