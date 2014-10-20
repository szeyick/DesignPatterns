package com.designPatterns.factoryMethod.product;

import java.util.Date;

/**
 * The {@link Iphone}.
 * <p>
 * This class represents the concrete product class. The creator/factory is
 * responsible for creating objects of this type to return to the client.
 * <p>
 * 
 * @author szeyick
 */
public class Iphone implements IProduct {

    /**
     * The product name.
     */
    private String productName;

    /**
     * The product code.
     */
    private String productCode;

    /**
     * The manufacturing date.
     */
    private Date manufacturingDate;

    /**
     * Product constructor.
     * 
     * @param productNameTmp
     *            - The product name.
     * @param productCodeTmp
     *            - The product code.
     * @param manufacturingDateTmp
     *            - The manufacturing date.
     */
    public Iphone(String productNameTmp, String productCodeTmp,
            Date manufacturingDateTmp) {
        this.productName = productNameTmp;
        this.productCode = productCodeTmp;
        this.manufacturingDate = manufacturingDateTmp;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getProductName() {
        return productName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getProductCode() {
        return productCode;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date getManufacturingDate() {
        return manufacturingDate;
    }
}
