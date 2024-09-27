package org.example.entity;

import java.math.BigDecimal;

public sealed class Square implements Figure permits Rectangle{
    BigDecimal side;
    @Override
    public BigDecimal getArea() {
        return side.multiply(side);
    }
}
