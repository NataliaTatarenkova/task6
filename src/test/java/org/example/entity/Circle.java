package org.example.entity;

import java.math.BigDecimal;

public record Circle(BigDecimal radius) implements Figure{
    @Override
    public BigDecimal getArea() {
        return null;
    }
}
