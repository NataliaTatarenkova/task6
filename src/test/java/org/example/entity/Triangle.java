package org.example.entity;

import java.math.BigDecimal;

public non-sealed class Triangle implements Figure{

    BigDecimal base;
    BigDecimal height;

    public BigDecimal getArea() {
        return new BigDecimal(0.5).multiply(base).multiply(height);
    }
}
