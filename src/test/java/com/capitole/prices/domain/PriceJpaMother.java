package com.capitole.prices.domain;

import com.capitole.ecommerce.infrastructure.db.springdata.config.Utils;
import com.capitole.ecommerce.infrastructure.db.springdata.jpa.PriceJpa;

public class PriceJpaMother {

    public static PriceJpa createOnDates(String startDate, String endDate) {
        return new PriceJpa(1, Utils.stringToDate(startDate), Utils.stringToDate(endDate),
                1, 35455, 0, 35.50, "EUR");
    }
}
