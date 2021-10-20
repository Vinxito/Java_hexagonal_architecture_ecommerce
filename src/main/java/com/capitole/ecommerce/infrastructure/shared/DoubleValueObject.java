package com.capitole.ecommerce.infrastructure.shared;

import java.io.Serializable;
import java.util.Objects;

public abstract class DoubleValueObject implements Serializable {

    private final Double value;

    public DoubleValueObject(Double value) {
        this.value = value;
    }

    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DoubleValueObject that = (DoubleValueObject) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
