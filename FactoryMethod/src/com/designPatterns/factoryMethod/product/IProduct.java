package com.designPatterns.factoryMethod.product;

import java.util.Date;

/**
 * The {@link IProduct}.
 * <p>
 * This product interface is to be implemented by all concrete products.
 * Concrete creators/factories will refer to objects that it can create through
 * this interface.
 * <p>
 * 
 * @author szeyick
 */
public interface IProduct {

    /**
     * @return - The name of the product.
     */
    String getProductName();

    /**
     * @return - The product code associated to the product.
     */
    String getProductCode();

    /**
     * @return - The manufacturing date of the product.
     */
    Date getManufacturingDate();
}
