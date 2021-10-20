package com.capitole.ecommerce.infrastructure.db.springdata.jpa;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PriceJpa {

    @Id
    private final Integer brandId;

    @Temporal(TemporalType.DATE)
    @Column(name = "startDate", columnDefinition = "DATE")
    private final Date startDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "endDate", columnDefinition = "DATE")
    private final Date endDate;

    private final Integer priceList;
    private final Integer productId;
    private final Integer priority;
    private final Double price;
    private final String curr;

    public PriceJpa() {
        this.brandId = null;
        this.startDate = null;
        this.endDate = null;
        this.priceList = null;
        this.productId = null;
        this.priority = null;
        this.price = null;
        this.curr = null;
    }

    public PriceJpa(Integer brandId, Date startDate, Date endDate, Integer priceList,
                    Integer productId, Integer priority, Double price, String curr) {
        this.brandId = brandId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priceList = priceList;
        this.productId = productId;
        this.priority = priority;
        this.price = price;
        this.curr = curr;
    }

    public static PriceJpa create(Integer brandId, Date startDate, Date endDate, Integer priceList, Integer productId, Integer priority,
                                  Double price, String curr) {
        return new PriceJpa(brandId, startDate, endDate, priceList, productId, priority, price, curr);
    }

    public Integer brandId() {
        return brandId;
    }

    public Date startDate() {
        return startDate;
    }

    public Date endDate() {
        return endDate;
    }

    public Integer priceList() {
        return priceList;
    }

    public Integer productId() {
        return productId;
    }

    public Integer priority() {
        return priority;
    }

    public Double price() {
        return price;
    }

    public String curr() {
        return curr;
    }
}
