package com.pluralsight;

import java.math.BigDecimal;

public class House extends FixedAsset{
    private int yearBuilt;
    private int squareFoot;
    private int bedroom;

    public House(String name, int yearBuilt, int squareFoot, int bedroom) {
        super(name);
        this.yearBuilt = yearBuilt;
        this.squareFoot = squareFoot;
        this.bedroom = bedroom;
    }

    @Override
    public BigDecimal getValue(){
        return null;
    }
}
