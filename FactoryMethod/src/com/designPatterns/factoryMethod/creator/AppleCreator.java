package com.designPatterns.factoryMethod.creator;

import java.util.Date;

import com.designPatterns.factoryMethod.product.IProduct;
import com.designPatterns.factoryMethod.product.Iphone;

/**
 * The {@link AppleCreator}
 * <p>
 * This class represents the concrete creator/factory that will create
 * {@link IProduct} objects on behalf of the client. This class implements the
 * factory method from its parent class so that it can control the type of
 * {@link IProduct} object that it can create.
 * <p>
 * 
 * @author szeyick
 */
public class AppleCreator extends AbstractCreator {

    /**
     * {@inheritDoc}
     */
    @Override
    protected IProduct buildProduct() {
        Date date = new Date();
        Iphone iphone = new Iphone("iPhone 6", "A1549 ", date);
        return iphone;
    }
}
