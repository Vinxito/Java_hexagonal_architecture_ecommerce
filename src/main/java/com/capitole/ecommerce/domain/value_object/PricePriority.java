package com.capitole.ecommerce.domain.value_object;

import com.capitole.ecommerce.infrastructure.shared.IntValueObject;

public class PricePriority extends IntValueObject {

    public PricePriority(Integer value) {
        super(value);
    }

    public PricePriority() {
        super(0);
    }
}
