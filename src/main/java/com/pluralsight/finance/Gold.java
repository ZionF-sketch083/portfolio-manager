package com.pluralsight;

import java.math.BigDecimal;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public BigDecimal getValue(){
        return null;
    }
}
