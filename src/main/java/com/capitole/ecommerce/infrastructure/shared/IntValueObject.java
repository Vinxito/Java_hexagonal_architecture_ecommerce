package com.capitole.ecommerce.infrastructure.shared;

import java.io.Serializable;
import java.util.Objects;

public abstract class IntValueObject implements Serializable {

    private final Integer value;

    public IntValueObject(Integer value) {
        this.value = value;
    }

    public Integer value() {
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
        IntValueObject that = (IntValueObject) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
