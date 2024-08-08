package org.example.entity;

import java.math.BigDecimal;

public sealed interface Figure permits Triangle, Circle, Square{
    BigDecimal getArea();
}
