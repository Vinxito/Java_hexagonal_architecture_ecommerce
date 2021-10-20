package com.capitole.ecommerce.application;

import com.capitole.ecommerce.domain.Price;
import com.capitole.ecommerce.domain.PriceRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProductFinder {

  private final PriceRepository priceRepository;

  public ProductFinder(PriceRepository priceRepository) {
    this.priceRepository = priceRepository;
  }

  public Price getProduct(Date date, Integer productId, Integer brandId) {
    return priceRepository.byDatesAndBrandIdAndProductId(date, productId, brandId);
  }
}
