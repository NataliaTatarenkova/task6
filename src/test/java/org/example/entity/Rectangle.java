package org.example.entity;

import java.math.BigDecimal;

public final class Rectangle extends Square{
    BigDecimal secondSide;
    @Override
    public BigDecimal getArea() {
        return secondSide.multiply(side);
    }
}
