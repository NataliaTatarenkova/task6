package org.example.entity;

import java.math.BigDecimal;

public sealed class Square implements Figure permits Rectangle{
    @Override
    public BigDecimal getArea() {
        return null;
    }
}
