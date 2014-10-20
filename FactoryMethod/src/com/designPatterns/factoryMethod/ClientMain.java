package com.designPatterns.factoryMethod;

import com.designPatterns.factoryMethod.creator.AbstractCreator;
import com.designPatterns.factoryMethod.creator.AppleCreator;
import com.designPatterns.factoryMethod.product.IProduct;

/**
 * The {@link ClientMain}
 * <p>
 * This is the program main runnable class. This client class is responsible for
 * creating the factory and calling its factory method to create a particular type of
 * {@link IProduct} object.
 * <p>
 * The behaviour of a factory method is similar to that of the standard factory
 * pattern where we call a generic method common to all factories to perform a
 * particular task.
 * 
 * @author szeyick
 */
public class ClientMain {

    /**
     * The program main.
     * @param args - Command line arguments.
     */
    public static void main(String[] args) {
        AbstractCreator appleCreator = new AppleCreator();
        appleCreator.shipProduct();
    }
}
