package com.capitole.ecommerce.domain;

import java.util.Date;

public interface PriceRepository {

   Price byDatesAndBrandIdAndProductId(Date date, Integer productId, Integer brandId);

}
