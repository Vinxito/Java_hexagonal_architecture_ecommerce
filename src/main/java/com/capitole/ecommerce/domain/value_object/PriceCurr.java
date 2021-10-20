package com.capitole.ecommerce.domain.value_object;

import com.capitole.ecommerce.infrastructure.shared.StringValueObject;

public class PriceCurr extends StringValueObject {

    public PriceCurr(String value) {
        super(value);
    }

    public PriceCurr() {
        super("");
    }
}
