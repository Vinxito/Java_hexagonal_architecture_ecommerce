package com.capitole.ecommerce.domain;

import com.capitole.ecommerce.domain.value_object.*;

import java.util.Date;

public class Price {

    private final PriceBrandId brandId;
    private final PriceStartDate startDate;
    private final PriceEndDate endDate;
    private final PricePricesList priceList;
    private final PriceProductId productId;
    private final PricePriority priority;
    private final PricePrice price;
    private final PriceCurr curr;

    public Price(PriceBrandId brandId, PriceStartDate startDate, PriceEndDate endDate, PricePricesList priceList,
                 PriceProductId productId, PricePriority priority, PricePrice price, PriceCurr curr) {
        this.brandId = brandId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priceList = priceList;
        this.productId = productId;
        this.priority = priority;
        this.price = price;
        this.curr = curr;
    }

    public Price() {
        this.brandId = null;
        this.startDate = null;
        this.endDate = null;
        this.priceList = null;
        this.productId = null;
        this.priority = null;
        this.price = null;
        this.curr = null;
    }

    public static Price create(Integer brandId, Date startDate, Date endDate, Integer priceList, Integer productId, Integer priority,
                               Double price, String curr) {
        return new Price(
                new PriceBrandId(brandId),
                new PriceStartDate(startDate),
                new PriceEndDate(endDate),
                new PricePricesList(priceList),
                new PriceProductId(productId),
                new PricePriority(priority),
                new PricePrice(price),
                new PriceCurr(curr));
    }

    public PriceBrandId brandId() {
        return brandId;
    }

    public PriceStartDate startDate() {
        return startDate;
    }

    public PriceEndDate endDate() {
        return endDate;
    }

    public PricePricesList priceList() {
        return priceList;
    }

    public PriceProductId productId() {
        return productId;
    }

    public PricePriority priority() {
        return priority;
    }

    public PricePrice price() {
        return price;
    }

    public PriceCurr curr() {
        return curr;
    }

}
