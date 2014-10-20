package com.designPatterns.factoryMethod.creator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.designPatterns.factoryMethod.product.IProduct;

/**
 * The {@link AbstractCreator}.
 * <p>
 * This creator represents the factory as it creates the {@link IProduct}
 * objects. It declares a factory method, where child classes that extend this
 * will be required to implement. This allows the child class to control what
 * type of {@link IProduct} object that it will create.
 * <p>
 * Depending on the need, child classes that implement the buildProduct method
 * can do as they wish to a particular type of object that they wish to return.
 * This can be handy if the client is to be deployed on different systems and
 * depending on the system, different behaviours are expected.
 * 
 * @author szeyick
 */
public abstract class AbstractCreator {

    /**
     * Allow a factory to ship a product.
     */
    public void shipProduct() {
        IProduct product = buildProduct();
        printShippingInvoice(product);
    }

    /**
     * Print the shipping invoice information for the product.
     */
    private void printShippingInvoice(IProduct product) {
        System.out.println("Shipping Invoice - ");
        System.out.println("Name - " + product.getProductName());
        System.out.println("Item Code - " + product.getProductCode());
        System.out.println("Manufactured Date - "
                + product.getManufacturingDate());
        System.out.println("---------------------------------");

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Shipped Date - " + dateFormat.format(date)); // 2014/08/06
                                                                         // 15:59:48
    }

    /**
     * @return - An initialised instance of the product.
     */
    protected abstract IProduct buildProduct();
}
